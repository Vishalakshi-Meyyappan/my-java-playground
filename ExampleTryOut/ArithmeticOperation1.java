package ExampleTryOut;

import java.util.Scanner;

public class ArithmeticOperation1 { //class name

    public static void main(String[] args) { //main method
        Scanner in = new Scanner(System.in); //scanner method to take input

        System.out.print("Input first number: "); //print statement to get input of int 1
        int num1 = in.nextInt(); //user input value

        System.out.print("Input second number: "); //print statement to get input of int 2
        int num2 = in.nextInt(); //user input value


        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //print statement of addition

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); //print statement of subtraction

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2)); //print statement of multiplication

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); //print statement of division

        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2)); //print statement of modulus
    }

}
