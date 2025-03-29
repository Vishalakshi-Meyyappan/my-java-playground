package JAVAStartedPart001;

import java.util.Scanner;

public class OddOrEven {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X%2!=0 && Y%2==0) {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
    }
/*
Question :
The program accepts two integers and print “YES” if only first number is odd and the second number is even.
Else the program must print “NO”.
(MFIB – Odd and Even (condition))
 */
