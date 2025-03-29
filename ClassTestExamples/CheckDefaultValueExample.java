package ClassTestExamples;

public class CheckDefaultValueExample { //Main class
    static int secondNumber ;
    static float thirdNumber ;

    public static void main(String[] args) { //Main method
        int firstNumber = 16;
        System.out.println(firstNumber);  //Printing value 1
        System.out.println(secondNumber); //Printing value 2
        System.out.println(thirdNumber);  //Printing value 3

    }
}

/*

public class CheckDefaultValue {
    public static void main(String[] args) {
        int Firstnumber;
        System.out.println(Firstnumber);

    }
}

ERROR:
--> This creates an error like "Firstnumber" --> has not been initialised.
--> So if you give the value for Firstnumber, it take's and shows the value.
 */

/*
public class CheckDefaultValue {
    int secondNumber ;

    public static void main(String[] args) {
        int firstNumber = 16;
        System.out.println(firstNumber);
        System.out.println(secondNumber);


    }
}

ERROR:
--> This shows an error in secondNumber as that name is not a static
--> So, if you type static in **static int secondNumber** ; the error disappears
--> We haven't given / intialised any value, so it takes like 0 as its default value.
--> Here, it shows only the value for first number.
--> So, for this we will remove and type System.out.println(econdNumber); in new line
--> Now it shows the value 16 0 !!
 */

/*
public class CheckDefaultValue { //Main class
    static int secondNumber ;
    static float thirdNumber ;

    public static void main(String[] args) { //Main method
        int firstNumber = 16;
        System.out.println(firstNumber);  //Printing value 1
        System.out.println(secondNumber); //Printing value 2
        System.out.println(thirdNumber);  //Printing value 3


    }
}

--> Since we are using Float --> it means decimal values
--> And all again, we haven't initialised any values, so it takes its own default values as
0.0 (0.0f --> in advanced computers)
--> The value will be 16 0 0.0 (0.0f)

 */


