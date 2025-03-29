package ExampleTryOut;

import java.util.Scanner;

public class MultiplicationTables2 { //class name

        public static void main(String[] args) { //main method
            Scanner in = new Scanner(System.in); //scanner method to take the input
            System.out.println("Input the Number: "); //to take user input as topic
            int n = in .nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "*" + i + " = " + (n * i)); //print statement to get output
            }
        }
    }

