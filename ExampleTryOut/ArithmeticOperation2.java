package ExampleTryOut;

import java.util.Scanner;

public class ArithmeticOperation2 { //class name
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //scanner method to take the input
        System.out.println("Input the first number: "); //to take user input as topic
        int n1 = scanner.nextInt(); //to take user input
        System.out.println("Input the second number: "); //to take user input as topic
        int n2 = scanner.nextInt(); //to take user input
        int sum = n1 + n2; //Addition's formula
        int minus = n1 - n2; //Subtraction's formula
        int multiply = n1 * n2; //Multiplication's formula
        int divide = n1 / n2; //Division's formula which gives the quotient
        int rnums = n1 % n2; //Modulo's formula which gives the reminder
        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, divide, rnums);
    }
}
