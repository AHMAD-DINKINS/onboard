#!/bin/sh

# clean repo
mvn clean
mvn compile

rm *.dtrace
rm *.decls*
rm ./src/test/java/*
rm -r ./evosuite
rm *.tmp

# ensures that pair programs have assertions
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment

#run test gens
mvn evosuite:generate -DcutsFile=myclasses.txt -DnumberOfCores=2 -DmemoryInMB=1600 -DtimeInMinutesPerClass=4 evosuite:export

#assuming path to dependencies CHANGE THIS LATER
java -cp ./target/classes:./dependencies/randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir=./src/test/java --time-limit=240 --progressdisplay=false --omit-field-file=omit_field_file.txt

#comment try catch
for file in ./src/test/java/*
  do python ./scripts/comment_try_catch.py --test $file
done

#run tests to generate report
mvn test -q

#uncomment try catch
for file in ./src/test/java/*
  do python ./scripts/comment_try_catch.py --test $file --uncomment
done

#create main in test files. This is needed to run daikon
python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/AppendPairProgram_ESTest.java --report ./target/surefire-reports/TEST-*PairProgram_ESTest.xml

#TODO mulitiple pair programs will be affected, need as input
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java

mvn test-compile

#need the name of pair program or keep it in same file and just instrument that file
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' AppendPairProgram_ESTest

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=AppendPairProgram_ESTest.decls-DynComp AppendPairProgram_ESTest

#chnage to unzip ES wildcard
gzip -d *PairProgram_ESTest.dtrace.gz

mv *PairProgram_ESTest.dtrace "${1}_FAIL_ESTest.dtrace"

python3 scripts/clear_main.py --test ./src/test/java/*PairProgram_ESTest.java

python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/*PairProgram_ESTest.java --report ./target/surefire-reports/TEST-*PairProgram_ESTest.xml --return-passing

python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/ErrorTest.java --report ./target/surefire-reports/TEST-ErrorTest.xml

python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/RegressionTest.java --report ./target/surefire-reports/TEST-RegressionTest.xml --return-passing

mvn test-compile

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' AppendPairProgram_ESTest

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=AppendPairProgram_ESTest.decls-DynComp AppendPairProgram_ESTest

gzip -d *PairProgram_ESTest.dtrace.gz

mv *PairProgram_ESTest.dtrace "${1}_PASS_ESTest.dtrace"

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
