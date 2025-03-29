package ExampleTryOut;

import java.util.Scanner;

public class SwapingOfTwoNumbers1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner method to take input
        // int, double, float
        System.out.print("Input A: "); //to take user input as topic [it can be any data type]
        int A = sc.nextInt(); //1st object to take user input
        System.out.print("Input B: "); //to take user input as topic [it can be any data type]
        int B = sc.nextInt(); //2nd object to take user input
        int temp; //3rd object to take user input

        /*int a, b, temp;
        a = 15;
        b = 27;
        */

        System.out.println("Before swapping : A, B = "+A+", "+ + B);
        temp = A;
        A = B;
        B = temp;
        System.out.println("After swapping : a, b = "+A+", "+ + B);
    }
}
