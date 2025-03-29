package ClassTestExamples;

import java.util.Scanner;

public class MultiplicationTables { //class name

        public static void main(String[] args) { //main method
            Scanner in = new Scanner(System.in); //scanner method to take the input
            System.out.println("Input the Number:"); //to take user input as topic
            int n = in.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(n + "x" + i + " = " + (n * i)); //print statement to get output
            }
        }
    }


