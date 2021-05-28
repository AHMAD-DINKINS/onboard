# Commands
    - All can be run from top-level directory

# Maven (General):
    - mvn compile: compile source
    - mvn test: test the compile source with suitable framework (mvn -Dtest=TestCircle#mytest test)
    - mvn package: take the compiled code and package it in its distributable format, such as a JAR
    - mvn clean: attempts to clean the files and directories generated by Maven during its build. While there are plugins that generate additional files, the Clean Plugin assumes that these files are generated inside the target directory.

# JQF (Maven Plugin)
    - mvn jqf:fuzz: Once you have written a jqf test, you can fuzz it with this command (mvn jqf:fuzz -Dclass=TestProgram -Dmethod=TestStudentSubmission -Dtime=120s)
    - mvn jqf:repro: Once the fuzzing stops due to a timeout or a CTRL+C, you can reproduce a generated input (such as a failure) (mvn jqf:repro -Dclass=edu.berkeley.cs.jqf.examples.closure.CompilerTest -Dmethod=testWithGenerator -Dinput=target/fuzz-results/edu.berkeley.cs.jqf.examples.closure.CompilerTest/testWithGenerator/corpus/id_000028)


# Evosuite (Maven Plugin)
    - mvn evosuite:generate: this is used to generate test cases with EvoSuite. Tests will be generated for all classes in all submodules. You need to be sure the code is compiled, eg “mvn compile evosuite:generate” (mvn -Dcatch_undeclared_exceptions=false -Dclass=TestProgram evosuite:generate)
    - mvn evosuite:export: the generated tests will be copied over to another folder, which can be set with the “targetFolder” option (the default value is “src/test/java”)
    
# Randoop (Command Line)
    - java randoop.main.Main: run randoop by invoking its main class (java -cp ./target/classes:../randoop-4.2.6/randoop-all-4.2.6.jar randoop.main.Main gentests --classlist=myclasses.txt --time-limit=60)
    
# Daikon (Command Line)
    - java -cp myclasspath:$DAIKONDIR/daikon.jar daikon.DynComp: create a .decls file with DynComp(java -cp ./target/classes:$DAIKONDIR/daikon.jar daikon.DynComp TestProgram)
    - java -cp myclasspath:$DAIKONDIR/daikon.jar daikon.Chicory --daikon --comparability-file=MyClass.decls-DynComp: create a data trace file with Chicory and run Daikon on the data trace file to detect invariants (java -cp ./target/classes:$DAIKONDIR/daikon.jar daikon.Chicory --daikon --comparability-file=TestProgram.decls-DynComp TestProgram > out.txt)
        or
    - java -cp myclasspath:$DAIKONDIR/daikon.jar daikon.Chicory --comparability-file=MyClass.decls-DynComp: create a data trace file with Chicory