#!/bin/sh

# clean repo
rm *.dtrace
rm .scaffolding_list*
rm ./src/test/java/generated/*

# ensures that pair programs have assertions and only inner put
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java --uncomment
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove

mvn clean
mvn compile

#assuming path to dependencies CHANGE THIS LATER
#run randoop
java -cp ./target/classes:./dependencies/randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir=./src/test/java/generated --time-limit=120 --progressdisplay=false --omit-field-file=omit_field_file.txt

# modify pair program
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java

#comment try catch
for file in $(ls -1 ./src/test/java/generated/ | grep -E '(ErrorTest|RegressionTest)[0-9][0-9]*.java$');
  do python3 ./scripts/comment_try_catch.py --test "src/test/java/generated/$file"
done

python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java

#run tests to generate report
mvn test -q

#uncomment try catch
for file in $(ls -1 ./src/test/java/generated/ | grep -E '(ErrorTest|RegressionTest)[0-9][0-9]*.java$');
  do python3 ./scripts/comment_try_catch.py --test "src/test/java/generated/$file" --uncomment
done

python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java --uncomment

# insert main with error tests
python3 scripts/insert_mains.py --path-to-tests ./src/test/java/generated/ErrorTest.java --report ./target/surefire-reports/TEST-ErrorTest.xml

# # insert main with regression tests
python3 scripts/insert_mains.py --path-to-tests ./src/test/java/generated/RegressionTest.java --report ./target/surefire-reports/TEST-RegressionTest.xml

# #TODO mulitiple pair programs will be affected, need as input
# # comment out assert to let daikon run without stopping 
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java

mvn test-compile

# iterate through failing tests, call call daikon front end on each of them, label trace files
for file in $(ls -1 ./src/test/java/generated/ | grep -E 'ErrorTest[0-9][0-9]*.java$'); do
file="${file%.*}"
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar daikon.Chicory --ppt-select-pattern='Test_?StudentSubmission' $file
gzip -d $file.dtrace.gz
mv $file.dtrace $1_Randoop$file.dtrace
done

for file in  $(ls -1 ./src/test/java/generated/ | grep -E 'RegressionTest[0-9][0-9]*.java$'); do
file="${file%.*}"
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar daikon.Chicory --ppt-select-pattern='Test_?StudentSubmission' $file
gzip -d $file.dtrace.gz
mv $file.dtrace $1_Randoop$file.dtrace
done

python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove