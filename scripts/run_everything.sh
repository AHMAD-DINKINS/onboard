#!/bin/sh

#clean repo
# mvn clean
# mvn compile

# rm ./src/test/java/*

# #run test gens
# mvn evosuite:generate -DcutsFile=myclasses.txt -DnumberOfCores=2 -DmemoryInMB=1600 -DtimeInMinutesPerClass=4 evosuite:export

# #assuming path to dependencies CHANGE THIS LATER
# java -cp ./target/classes:../randoop-4.2.6/randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --junit-output-dir=./src/test/java --time-limit=240

# # comment try catch
# for file in ./src/test/java/*
#   do python ./scripts/comment_try_catch.py --test $file
# done

# # run tests to generate report
# mvn test

# # uncomment try catch
# for file in ./src/test/java/*
#   do python ./scripts/comment_try_catch.py --test $file --uncomment
# done

# python scripts/init_test_runner.py --path-to-tests ./src/test/java/AppendPairProgram_ESTest.java --report ./target/surefire-reports/TEST-AppendPairProgram_ESTest.xml

# python scripts/init_test_runner.py --path-to-tests ./src/test/java/ErrorTest.java --report ./target/surefire-reports/TEST-ErrorTest.xml

# python scripts/init_test_runner.py --path-to-tests ./src/test/java/ErrorTest.java --report ./target/surefire-reports/TEST-ErrorTest.xml --return-passing

# mvn test-compile

# Assuming 
# java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:../junit-4.13.jar daikon.DynComp ErrorTest0

# java -cp myclasspath:$DAIKONDIR/daikon.jar daikon.Chicory --comparability-file=ErrorTest0.decls-DynComp ErrorTest0

# java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:../junit-4.13.jar daikon.DynComp RegressionTest0

# java -cp myclasspath:$DAIKONDIR/daikon.jar daikon.Chicory --comparability-file=RegressionTest0.decls-DynComp RegressionTest0

# java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:../junit-4.13.jar:../evosuite/standalone_runtime/target/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:../hamcrest-core-1.3.jar daikon.DynComp AppenPairProgram_ESTest

# java -cp ./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar:../junit-4.13.jar:../evosuite/standalone_runtime/target/evosuite-standalone-runtime-1.1.1-SNAPSHOT.jar:../hamcrest-core-1.3.jar daikon.Chicory --comparability-file=AppenPairProgram_ESTest.decls-DynComp AppenPairProgram_ESTest



