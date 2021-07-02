#!/bin/sh

# clean repo
mvn clean
mvn compile

rm *.dtrace
rm *.tmp
rm *.decls*
rm ./src/test/java/*
rm *.tmp

# ensures that pair programs have assertions
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment

#assuming path to dependencies CHANGE THIS LATER
#run randoop
java -cp ./target/classes:./dependencies/randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir=./src/test/java --time-limit=120 --progressdisplay=false --omit-field-file=omit_field_file.txt

#comment try catch
for file in $(ls -1 ./src/test/java/ | grep -E '(ErrorTest|RegressionTest)[0-9][0-9]*.java$');
  do python3 ./scripts/comment_try_catch.py --test "src/test/java/$file"
done

#run tests to generate report
mvn test -q

#uncomment try catch
for file in $(ls -1 ./src/test/java/ | grep -E '(ErrorTest|RegressionTest)[0-9][0-9]*.java$');
  do python3 ./scripts/comment_try_catch.py --test "src/test/java/$file" --uncomment
done

# insert main with failing tests
python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/ErrorTest.java --report ./target/surefire-reports/TEST-ErrorTest.xml

# insert main with passing tests
python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/RegressionTest.java --report ./target/surefire-reports/TEST-RegressionTest.xml --return-passing

#TODO mulitiple pair programs will be affected, need as input
# comment out assert to let daikon run without stopping 
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java

mvn test-compile

# iterate through failing tests, call call daikon front end on each of them, label trace files
for file in $(ls -1 ./src/test/java/ | grep -E 'ErrorTest[0-9][0-9]*.java$'); do
file="${file%.*}"
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' $file
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=$file.decls-DynComp $file
gzip -d $file.dtrace.gz
mv $file.dtrace $1_FAIL_Randoop$file.dtrace
done

for file in  $(ls -1 ./src/test/java/ | grep -E 'RegressionTest[0-9][0-9]*.java$'); do
file="${file%.*}"
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' $file
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=$file.decls-DynComp $file
gzip -d $file.dtrace.gz
mv $file.dtrace $1_PASS_Randoop$file.dtrace
done

python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment