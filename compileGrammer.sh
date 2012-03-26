#!/bin/bash
# Disabled to compile Java.g, since there are bugs in ANTLR3.4.
java org.antlr.Tool Java.g
# If enabled, then must change generated source files manually. LATEST: add script for fix errors
./fixJavaParser.sh
# other commands
javac CodeMetrics.java
java org.antlr.Tool JavaTreeParser.g
