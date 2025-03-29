package ExampleTryOut;

import java.util.Scanner;

public class AreaOfACircleUserInput { //class name
    public static void main(String args[]){ //main method
        int radius; //taking i/p as integer data type
        double area; //taking i/p as double data type as we are attaching mathematical formula Math.PI[22/7 / 3.14]
        Scanner sc = new Scanner(System.in); //User input method
        System.out.println("Enter the radius of the circle : "); //to take user input as topic
        radius = sc.nextInt(); //to take user input
        area = (radius*radius)*Math.PI; //to take user input with mathematical expression
        System.out.println("Area of the circle is : "+area); //to take user input as topic
    }
}

/*
public class AreaOfACircle { //class name
    public static void main(String args[]){ //main method
        int radius; //taking i/p as integer data type
        int / float area; //taking i/p as int / float data type as we are 22/7 / 3.14
        Scanner sc = new Scanner(System.in); //User input method
        System.out.println("Enter the radius of the circle : "); //to take user input as topic
        radius = sc.nextInt(); //to take user input
        area = (22*radius*radius)/7; //to take user input with mathematical expression
        System.out.println("Area of the circle is : "+area); //to take user input as topic
    }
 */
