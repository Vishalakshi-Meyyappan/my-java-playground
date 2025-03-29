package ExampleTryOut;

import java.util.Scanner;

public class ClassTestFileUserInput { //class name

        public static void main(String[] args) //main method
        {
            Scanner input = new Scanner (System.in); //scanner method to take the input
            System.out.print("Input your first name: "); //to take user input as topic
            String fname = input.next(); //to take user input
            System.out.print("Input your last name: "); //to take user input as topic [it can be any data type]
            String lname = input.next(); //to take user input
            System.out.println(); //[optional]
            System.out.println("Hello \n"+fname+" "+lname); //print statement
        }
    }

/*
public class ClassTestFileUserInput { //class name

        public static void main(String[] args) //main method
        {
            Scanner input = new Scanner (System.in); //scanner method to take the input
            System.out.print("Input your first name: ");//to take user input as topic
            String fname = input.next(); //to take user input
            System.out.print("Input your last name: "); //to take user input as topic [it can be any data type]
            String lname = input.next(); //to take user input
            System.out.println();
            System.out.println("Hello \n"+fname+" "+lname); //print statement
        }
 */
