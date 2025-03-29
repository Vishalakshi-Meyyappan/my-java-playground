package ExampleTryOut;

import java.util.Scanner;

public class MultiplicationTables1 { //class name

        public static void main(String[] args) {  //main method
            Scanner in = new Scanner(System.in); //scanner method to take the input

            System.out.print("Input a number: "); //to take user input as topic
            int num1 = in.nextInt(); //to take user input

            for (int i=0; i< 10; i++){
                System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1))); //print statement to get output
            }
        }
    }

