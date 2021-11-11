#
# makefile 
#
# input file for 'make' build tool ( /usr/bin/make )
# to build solution for JUnit sample
#
# @author Dr. Fenwick
# @version Summer 2020
#

JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar 
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_COMMAND =  -jar checkstyle-5.5-all.jar

default: 
	@echo "usage: make target"
	@echo "4 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ test - runs JUnit5 tests"
	@echo "____________________ check - runs my custom checkstyle"
	@echo "Just starting with make? Try these 4 make commands successively:"
	@echo "________ make clean ; make compile ; make test ; make check"

# makefile syntax
#target-name: files dependent on (can use multiple lines by ending
#             lines with \
#<TAB char>Unix command-line command
#<TAB char>Unix command-line command
#etc.
#Essential that command lines start with single TAB character

# compile target, need to list out the Java files used
# the ending backslash \ character "escapes" the immediately following newline
# (like \n escapes the n for special handling), here it "ignores" the newline
# in essence giving us a longer line
compile: 
	@echo "Compiling..."
	javac -cp .:$(JUNIT5_JAR) *.java

clean:
	rm -f *~
	rm -f *.class

test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path 

demo: Demo.java
	java Demo

check: mystyle.xml
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Coin.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml CadDime.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml CADMintFactory.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml CadNickel.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml CadQuarter.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Composition.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Cu25.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Cu75.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Cu885.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Cu9167.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Demo.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Dime.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Dollar.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml FiftyCent.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml HalfDollar.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Loonie.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml MintFactory.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Nickel.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Penny.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Quarter.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Toonie.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml UnknownComp.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml USDMintFactory.java
