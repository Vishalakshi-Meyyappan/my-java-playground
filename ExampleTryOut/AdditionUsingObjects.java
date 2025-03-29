package ExampleTryOut;

public class AdditionUsingObjects {  //Class name
    //Main method starts
    public static void main(String [] args) {  //main method
        AdditionUsingObjects obj = new AdditionUsingObjects();  //creating an new object
        obj.addition();  //Method call

    }
    //Main method ends
    public void addition (){  //Method declaration / Definition
        int num1 = 20;  //Local variables 1
        int num2 = 60; //Local variables 2
        int Total = num1 + num2;  //Local variables 3
        System.out.println(Total);  //Print the statement

    }
}

//Here,we are printing an value of addition!
//If object doesn't be created, the program throws an error

//***************************************************************************************************//

/* Type 2

public class ExampleTryOut {  //Class name
//Main method starts
    public static void main(String [] args) {  //main method
      OwnTryExamples.Exercise2 obj = new OwnTryExamples.Exercise2();  //creating an new object
      obj.addition();  //Method call

    }
//Main method ends
    public void addition (){  //Method declaration / Definition
        int num1 = 20;  //Local variables 1
        int num2 = 60; //Local variables 2
        int Total = num1 + num2;  //Local variables 3
        System.out.println("Total is (:) " +Total);  //Print the statement

    }
}

 */

//****************************************************************************************************//

/* Type 3

public class ExampleTryOut {  //class name

//Main method starts
    public static void main(String[] args) {  //main method
        System.out.println(20+60);  //Printing the statement
    }

}
*/

//The above program shows that --> the statement is directly given to print statement!