package ExampleTryOut;

import java.util.Scanner;

public class PersonalDetailsUserInput { //class name

    public static void main(String[] args) {  //main method
        Scanner input = new Scanner (System.in); //scanner method to take the input
        System.out.print("Input full name: ");//to take user input as topic
        String full_name = input.next(); //to take user input
        System.out.print("Input Age: "); //to take user input as topic
        String Age = input.next(); //to take user input
        System.out.print("Input DOB: "); //to take user input as topic
        String DOB = input.next(); //to take user input
        System.out.print("Input Education qualification: "); //to take user input as topic
        String Education_qualification = input.next(); //to take user input

    }
}
