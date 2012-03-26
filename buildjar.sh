#!/bin/bash
javac *.java
jar -cf ComputeMetrics.jar *.class
rm -rf *.class
