package ClassTestExamples;

import java.util.Scanner;
//Odd number Program using methods
public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Odd Number: ");
        int Number = sc.nextInt(); //to take number from user
        OddNumbers obj = new OddNumbers(); //to call a method, so creating object
        obj.printOddDigits(Number); //calling a method,usingobject
        }
    void printOddDigits(int Number){ //using method
        for(int i=1; i<=Number; i++){
            if(i%2!=0){  //to tell odd number [%--> shows the reminder, so it for odd digits, the reminder should be not equal to 0]
                System.out.println("The Odd Digits are :" + i);
            }
        }

    }

}

/*
**Basic Odd number program**

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Odd Number: ");
        int Number = sc.nextInt(); //to take number from user
        for(int i=1; i<=Number; i++){
            if(i%2!=0){
--> to tell odd number [%--> shows the reminder, so it for odd digits, the reminder should be not equal to 0]
                System.out.println("The Odd Digits are :" + i);
            }
        }

 */

