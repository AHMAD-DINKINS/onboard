#!/bin/sh

# clean repo
mvn clean
mvn compile

rm *.dtrace
rm *.tmp
rm *.decls*
rm ./src/test/java/*
rm -r ./evosuite
rm *.tmp

# ensures that pair programs have assertions
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment

#run evosuite
mvn evosuite:generate -DcutsFile=myclasses.txt -DnumberOfCores=2 -DmemoryInMB=1600 -DtimeInMinutesPerClass=3 evosuite:export

#comment try catch
python ./scripts/comment_try_catch.py --test ./src/test/java/*PairProgram_ESTest.java

#run tests to generate report
mvn test -q

#uncomment try catch
python ./scripts/comment_try_catch.py --test ./src/test/java/*PairProgram_ESTest.java --uncomment

#create main in test files for failing tests. This is needed to run daikon
python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/*Program_ESTest.java --report ./target/surefire-reports/TEST-*PairProgram_ESTest.xml

#TODO mulitiple pair programs will be affected, need as input
# comment out assert to let daikon run without stopping 
python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java

mvn test-compile

#need the name of pair program or keep it in same file and just instrument that file
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' AppendPairProgram_ESTest

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=AppendPairProgram_ESTest.decls-DynComp AppendPairProgram_ESTest

#chnage to unzip ES wildcard
gzip -d *PairProgram_ESTest.dtrace.gz

# Label dtrace
mv *PairProgram_ESTest.dtrace "${1}_FAIL_ESTest.dtrace"

#clear main from test file so we can resinsturment with passing tests
python3 scripts/clear_main.py --test ./src/test/java/*PairProgram_ESTest.java

# insert main with passing tests
python3 scripts/init_test_runner.py --path-to-tests ./src/test/java/*PairProgram_ESTest.java --report ./target/surefire-reports/TEST-*PairProgram_ESTest.xml --return-passing

mvn test-compile

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.DynComp --ppt-select-pattern='TestStudentSubmission' AppendPairProgram_ESTest

java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='TestStudentSubmission' --comparability-file=AppendPairProgram_ESTest.decls-DynComp AppendPairProgram_ESTest

gzip -d *PairProgram_ESTest.dtrace.gz

mv *PairProgram_ESTest.dtrace "${1}_PASS_ESTest.dtrace"

python3 scripts/comment_assert.py --test ./src/main/java/*PairProgram.java --uncomment