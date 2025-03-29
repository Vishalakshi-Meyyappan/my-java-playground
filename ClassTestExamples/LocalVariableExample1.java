package ClassTestExamples;

public class LocalVariableExample1 {  //class
    //Main method starts
    public static void main(String[] args) {   //Main method
        LocalVariableExample1 object1 = new LocalVariableExample1();   //creating an new object
        object1.add();  //Method call
    }
    //Main method ends
    public void add () {   //Method declaration / Definition
        int num1 = 70;   //Local variables 1
        int num2 = 60;  //Local variables 2
        int sum = num1 + num2;      //Local variables 3
        System.out.println(sum);   //Print the statement
    }

}

//Here,we are printing an value of addition!
//If object doesn't be created, the program throws an error



