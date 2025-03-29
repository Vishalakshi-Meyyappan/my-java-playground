package ClassTestExamples;

public class CommandLineArgumentsExample { //Main class
    //Main method starts
    public static void main(String[] abcd) { //Main method
        System.out.println(abcd[0]); //Printing argument 1
        System.out.println(abcd[1]); //Printing argument 2
        System.out.println(abcd[2]); //Printing argument 3
//Main method ends
    }
}

/*
This method is used for very simple way of getting value from user, instead of writting Java Pgm
as Scanner* etc.. to get the values randomly from user.
For example::
Enter the value 1:
Enter the value 2:

--> We use to enter the value in above. For this we use Scanner* classes to get the input in a
proper method.
-->This command line arguments is a concept to just know, this is also the way to get the values
directly from the user.

1) Here args gets converted into  --> abcd
--> Args is nothing but arguments.
--> This args* is just a name which is been standard in Java Pgm. This can be changed into
any name randomly.
--> After your input abcd* you will be going to --> Run --> Edit configuration --> Program Arguments
and give your
Pgm arguments like giving some values to it.

Here, we have given --> Visha,12345,abc
Where your Visha --> abcd [0] ; 12345 --> abcd [1] ; abc --> abcd [3]

Error:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
at VarshaMamClassPrograms.CommandLineArgumentsExample.main(VarshaMamClassPrograms.CommandLineArgumentsExample.java:4)
--> Since we are giving, 3 argumetns this gives this above error.
--> If we are giving, 1 arguments this error mostly never occurs.

--> Also This IntelliJ is an IDE this creates the above error, If we are doing un previous typing method,
--> This method follows as --> Typing the code in notepad* --> Printing in command prompt.
--> So that doesn't gives any errors as above.

2) Here, we have given --> Visha,12345,abc
Where your Visha --> abcd [0]  12345 --> abcd [1]  abc --> abcd [3]
--> If we do not put semi-colon, and put spaces alone in between each no.arguments, then the
o/p will be appeared without any issues.

O/P:
Visha
12345
abcd
 */
/*
Error 101
public class VarshaMamClassPrograms.CommandLineArgumentsExample { //Main class
    public static void main(String[] abcd) { //Main method
        System.out.println(abcd[0]);
        System.out.println(abcd[1]);
        ( System.out.println(abcd[2]); )
    }
}
--> If giving System.out.println(abcd[]); --> 2 times for 3 inputs, it does not print in the final
argument in command prompt and this the right way.
--> In IDE, That prints the final argument also, because it is taking that argument as previous
argument into a single word!
 */
