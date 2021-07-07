#!/bin/sh

# clean repo
rm *.dtrace
rm .scaffolding_list*
rm *.decls*
rm ./src/test/java/*

# ensures that pair programs have assertions
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java --uncomment
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove

mvn clean
mvn compile

#run evosuite
mvn evosuite:generate -DcutsFile=myclasses.txt -DnumberOfCores=2 -DmemoryInMB=1600 -DtimeInMinutesPerClass=4 evosuite:export

# modify pair program
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java

#comment try catch
python3 ./scripts/comment_try_catch.py --test ./src/test/java/PairProgram_ESTest.java
python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java

#run tests to generate report
mvn test -q

#uncomment try catch
python3 ./scripts/comment_try_catch.py --test ./src/test/java/PairProgram_ESTest.java --uncomment
python3 ./scripts/comment_try_catch.py --test ./src/main/java/PairProgram.java --uncomment

#create main in test files. This is needed to run daikon
python3 scripts/insert_mains.py --path-to-tests ./src/test/java/PairProgram_ESTest.java --report ./target/surefire-reports/TEST-PairProgram_ESTest.xml

#TODO mulitiple pair programs will be affected, need as input
# comment out assert to let daikon run without stopping 
python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java

mvn test-compile

#need the name of pair program or keep it in same file and just instrument that file
for file in $(ls -1 ./src/test/java/ | grep -E 'PairProgram_ESTest_[a-zA-Z]*(Error|Exception|PASSING).java$'); do
file="${file%.*}"
java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:dependencies/junit-4.13.jar:dependencies/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:dependencies/hamcrest-core-1.3.jar daikon.Chicory --ppt-select-pattern='Test_?StudentSubmission' --comparability-file=$file.decls-DynComp $file
gzip -d $file.dtrace.gz
# Label dtrace
mv $file.dtrace "${1}_$file.dtrace"
done

python3 scripts/comment_assert.py --test ./src/main/java/PairProgram.java --uncomment
python3 ./scripts/insert_put.py --put ./put.txt --pair-program ./src/main/java/PairProgram.java --remove