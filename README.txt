Team: Will Canup, Adam Azmi, Joseph Aycock, Hudson Martin

We try to use the skeleton code given by Brandon (TA) from his email sent to everyone.
While trying to do the project, we were having problems trying to change the Absyn folders and files within however we are still getting errors.
We believe it might be the Grm.cup files in the Parse folder.
When trying to run 'make', we are given this in our terminal below:

    cd Parse; java java_cup.Main -parser Grm -expect 3 -nonterms -dump_grammar -dump_states <Grm.cup >Grm.out 2>Grm.err
    javac -g Parse/*.java
    Parse/Parse.java:16: error: cannot access Grm
        Grm parser = new Grm(new Yylex(inp,errorMsg), errorMsg);
        ^
    bad source file: ./Parse/Grm.java
        file does not contain class Parse.Grm
        Please remove or make sure it appears in the correct subdirectory of the sourcepath.
    Note: ./Symbol/Symbol.java uses unchecked or unsafe operations.
    Note: Recompile with -Xlint:unchecked for details.
    1 error
    make: *** [Makefile:4: Parse/Lexer.class] Error 1

We see that in the Parse.java, on line 16:

    Grm parser = new Grm(new Yylex(inp,errorMsg), errorMsg);

There is a error in 'Grm' that there is no 'Grm cannot be resolved to a type'.
We do not know how to fix this problem the only thing we coudl probably come up with is that maybe our Grm.cup file is wrong.
Once we run './test.sh', we are given:

    cp Parse/Yylex* ./.
    rm -f */*.class Parse/Grm.java Parse/Grm.err Parse/Grm.out
    mv Yylex* ./Parse/
    cd Parse; java java_cup.Main -parser Grm -expect 3 -nonterms -dump_grammar -dump_states <Grm.cup >Grm.out 2>Grm.err
    javac -g Parse/*.java
    Parse/Parse.java:16: error: cannot access Grm
        Grm parser = new Grm(new Yylex(inp,errorMsg), errorMsg);
        ^
    bad source file: /classes/cs4351/cs435106/prog1/Parse/Grm.java
        file does not contain class Parse.Grm
        Please remove or make sure it appears in the correct subdirectory of the sourcepath.
    Note: /classes/cs4351/cs435106/prog1/Symbol/Symbol.java uses unchecked or unsafe operations.
    Note: Recompile with -Xlint:unchecked for details.
    1 error
    make: *** [Makefile:4: Parse/Yylex$1.class] Error 1
    Exception in thread "main" java.lang.NoClassDefFoundError: Parse/Parse
            at Parse.Main.main(Main.java:11)
    Caused by: java.lang.ClassNotFoundException: Parse.Parse
            at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
            at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
            at java.base/java.lang.

We tried using resources such as ChatGpt, resources given from the moodle pages for project 2, and as well as the C89.
Could not find the solution to resolve this, even trying to use Bradon emails to help to see if we can find something that could lead us to the right path.
However, we could not fix it so this is a documentation to show what problems we were having in the project.