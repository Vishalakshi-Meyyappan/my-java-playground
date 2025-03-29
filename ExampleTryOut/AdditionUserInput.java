package ExampleTryOut;

import java.util.Scanner;

public class AdditionUserInput { //class name

        public static void main(String[] args) //main method
        {
            Scanner input = new Scanner (System.in); //scanner method to take the input
            System.out.print("Input the first number: "); //to take user input as topic
            int num1 = input.nextInt(); //to take user input
            System.out.print("Input the second number: "); //to take user input as topic
            int num2 = input.nextInt(); //to take user input
            int sum = num1 + num2; //addition statement
           //System.out.println(); //[optional]
            System.out.println("Sum: "+sum); //print statement
        }
    }