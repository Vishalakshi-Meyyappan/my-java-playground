package ClassTestExamples;

import java.util.Scanner;

public class PrintingFullNames {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your First Name : ");
            String firstname = input.next();

            System.out.println("Enter your Last Name : ");
            String lastname = input.next();

            System.out.println("Your Full Name is: "+firstname+" "+lastname);
        }
}


