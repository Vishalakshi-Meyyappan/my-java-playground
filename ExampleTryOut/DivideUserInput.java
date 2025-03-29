package ExampleTryOut;

import java.util.Scanner;

public class DivideUserInput {
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //scanner method to take input
        System.out.print("Input A: "); //to take user input as topic [it can be any data type]
        float A = sc.nextFloat(); //to take user input
        System.out.print("Input B: "); //to take user input as topic [it can be any data type]
        float B = sc.nextFloat(); //to take user input
        System.out.println(A/B); //print statement
    }

}
