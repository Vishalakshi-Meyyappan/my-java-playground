package ExampleTryOut;

import java.util.Scanner;

public class MultiplicationUserInput { //class name
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //scanner method to take input
        System.out.print("Input A: "); //to take user input as topic [it can be any data type]
        float A = sc.nextFloat(); //to take user input
        System.out.print("Input B: "); //to take user input as topic [it can be any data type]
        float B = sc.nextFloat(); //to take user input
        System.out.println(A*B); //print statement
    }
}

/*
    public class UserInputTakingExample { //class name
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //scanner method to take input
        float A = sc.nextFloat(); //simply gave to take the i/p [it might be any data type]
        float B = sc.nextFloat(); //simply gave to take the i/p [it might be any data type]
        System.out.println(A*B); //print statement
    }

 */