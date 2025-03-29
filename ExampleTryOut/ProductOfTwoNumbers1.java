package ExampleTryOut;

import java.util.Scanner;

public class ProductOfTwoNumbers1 { //class name
    public static void main(String[] args) { //main method
        Scanner in = new Scanner(System.in); //scanner method to take the input

        System.out.print("Input first number: "); //to take user input as topic
        int num1 = in.nextInt(); //to take user input

        System.out.print("Input second number: "); //to take user input as topic
        int num2 = in.nextInt(); //to take user input

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2); //print statement to get output
    }
}
