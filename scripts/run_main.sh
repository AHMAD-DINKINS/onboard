#!/bin/sh

mvn test-compile

java -cp ./target/test-classes:./target/classes:dependencies/* PairProgram_ESTest