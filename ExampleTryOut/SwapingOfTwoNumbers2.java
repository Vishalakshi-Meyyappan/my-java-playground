package ExampleTryOut;

import java.util.Scanner;

public class SwapingOfTwoNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner method to take input
        // int, double, float
        System.out.print("Input A: "); //to take user input as topic [it can be any data type]
        int A = sc.nextInt(); //to take user input
        System.out.print("Input B: "); //to take user input as topic [it can be any data type]
        int B = sc.nextInt(); //to take user input

        System.out.println("Before swapping : A, B = "+A+", "+ + B);
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("After swapping : A, B = "+A+", "+ + B);
    }

}
