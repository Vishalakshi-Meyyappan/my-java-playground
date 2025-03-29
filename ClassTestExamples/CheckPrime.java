package ClassTestExamples;

import java.util.Scanner;
//this program is to check prime with user's input
public class CheckPrime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else {
            System.out.println(num + " is a not a prime number.");
        }

    }
}

//The below program is direct program to check the prime number
/*

public class CheckPrime {
    public static void main(String[] args) {
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else {
            System.out.println(num + " is a not a prime number.");
        }

    }
}
 */
