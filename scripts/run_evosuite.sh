#!/bin/sh

#clean repo
rm *.dtrace
rm .scaffolding_list*
rm ./src/test/java/generated/*

# ensures that pair programs have assertions
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java --uncomment
# make sure th wrapper is not there
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove

mvn clean
mvn compile

#run evosuite
mvn evosuite:generate -DcutsFile=myclasses.txt -DnumberOfCores=2 -DmemoryInMB=1600 -DtimeInMinutesPerClass=4 evosuite:export -DtargetFolder=./src/test/java/generated/

# modify tests
python3 ./scripts/modify_tests.py -t /home/ahmaddinkins/onboard/src/test/java/generated/PairProgram_ESTest.java -p "TestStudentSubmission" --type "List" -a "int elem"

# modify pair program
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java

#comment try catch
python3 ./scripts/comment_try_catch.py --test ./src/test/java/generated/PairProgram_ESTest.java
python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java

#run tests to generate report
mvn test -q

#uncomment try catch
python3 ./scripts/comment_try_catch.py --test ./src/test/java/generated/PairProgram_ESTest.java --uncomment
python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java --uncomment

#create main in test files. This is needed to run daikon
python3 scripts/insert_mains.py --path-to-tests ./src/test/java/generated/PairProgram_ESTest.java --report ./target/surefire-reports/TEST-PairProgram_ESTest.xml

#TODO mulitiple pair programs will be affected, need as input
# comment out assert to let daikon run without stopping 
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java

mvn test-compile

#need the name of pair program or keep it in same file and just instrument that file
timeout 30m java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='Test_?StudentSubmission' PairProgram_ESTest

if [ $? == "124" ]
then
  echo "TIMED OUT"
fi

gzip -d PairProgram_ESTest.dtrace.gz

# Label dtrace
mv PairProgram_ESTest.dtrace "${1}_PairProgram_ESTest.dtrace"

python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java --uncomment
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove