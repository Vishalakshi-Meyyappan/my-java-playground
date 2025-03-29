package ClassTestExamples;


/*
Local Variable Example is the class name
 */
public class LocalVariableExample2 {   //class
    //Main method starts
    public static void main(String[] args) {   //Main method
//inside the main class but outside the method, with a key word named "static".
        LocalVariableExample2 object1 = new LocalVariableExample2(); //creating the object
        int sum = object1.add();   //Method call  //calling sum
        System.out.println(sum);  //printing sum
        int sub = object1.sub(sum);  //Method call //calling sub(sum)
        System.out.println(sub);  //printing sub
        System.out.println(object1.sub(sum));  //printing the object1.sub(sum) again to get this twice..
    }
    //Main method ends..
    public int add () {   //Method declaration / Definition
        int num1 = 70;   //Local variables 1
        int num2 = 60;  //Local variables 2
        int sum = num1 + num2;      //Local variables 3
        return sum;  //returning #sum to get the value for futher operations
    }
    public int sub (int sum) {  //Method declaration / Definition
        int diff = sum - 5;   //Local variable 4
        return diff;  //returning #diff to get the value for futher operations
    }
}
//Here, we are using #return fnc., to get the #sum for doing the upcoming arithmetic operations..



