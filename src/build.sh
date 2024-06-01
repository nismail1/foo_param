#!/bin/bash

# Compile the Java files
javac -d ../bin src/foo_parameterization/core/*.java src/foo_parameterization/tests/TestVolume.java

# Run the TestVolume class
java -cp ../bin foo_parameterization.tests.TestVolume
