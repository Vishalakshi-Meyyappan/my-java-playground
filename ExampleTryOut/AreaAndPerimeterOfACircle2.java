package ExampleTryOut;

import java.util.Scanner;

public class AreaAndPerimeterOfACircle2 { //class name

        public static void main(String[] args) { //main method
            Scanner io = new Scanner(System.in); //scanner method to take the input
            System.out.println("Input the radius of the circle: ");  //to take user input as topic
            double radius = io.nextDouble(); //to take double as inputghh
            System.out.println("Perimeter is = " + (2 * radius * Math.PI)); //to print the taken input with formula
            System.out.println("Area is = " + (Math.PI * radius * radius)); //to print the taken input with formula
        }
    }

