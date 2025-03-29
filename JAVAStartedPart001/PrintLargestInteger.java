package JAVAStartedPart001;

import java.util.Scanner;

public class PrintLargestInteger {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.print( num1 );
            }
            else
            {
                System.out.print(num2);
            }
        }
    }


