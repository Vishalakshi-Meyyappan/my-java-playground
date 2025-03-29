package ExampleTryOut;

import java.util.Scanner;

public class ConversionOfDecimalToBinary2 {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in); //scanner method to take input
            System.out.println("Input A: "); //to take user input as topic [it can be any data type]
            int A = sc.nextInt(); //to take user input
            System.out.println(Integer.toBinaryString(A)); //optional //using predefined method
            System.out.println("Binary representation is " +Integer.toBinaryString(A));

            System.out.print("Input B: "); //to take user input as topic [it can be any data type]
            int B = sc.nextInt(); //to take user input
            System.out.println(Integer.toBinaryString(B)); //optional //using predefined method
            System.out.println("Binary representation is " +Integer.toBinaryString(B));

            System.out.print("Input C: "); //to take user input as topic [it can be any data type]
            int C = sc.nextInt(); //to take user input
            System.out.println(Integer.toBinaryString(C)); //optional //using predefined method
            System.out.println("Binary representation is " +Integer.toBinaryString(C));

            System.out.print("Input D: "); //to take user input as topic [it can be any data type]
            int D = sc.nextInt(); //to take user input
            System.out.println(Integer.toBinaryString(D)); //optional //using predefined method
            System.out.println("Binary representation is " +Integer.toBinaryString(D));

        }
    }

/*
 public static void main(String a[]){
    	System.out.println("Binary representation of 124: ");
    	System.out.println(Integer.toBinaryString(124));
        System.out.println("\nBinary representation of 45: ");
        System.out.println(Integer.toBinaryString(45));
        System.out.println("\nBinary representation of 999: ");
        System.out.println(Integer.toBinaryString(999));
    }
*/
