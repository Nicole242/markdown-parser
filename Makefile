CPATH=lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:.
CPATH2=lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore:.

test: MarkdownParse.class MarkdownParseTest.class run

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp $(CPATH) MarkdownParseTest.java

run:
	java -cp $(CPATH2) MarkdownParseTest