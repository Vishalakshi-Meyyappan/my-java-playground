package JAVAStartedPart001;

import java.util.Scanner;

public class PrintYesAtLeastOneOfTheTwoIntegersIsEven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A%2==0 & B%2!=0) {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
    }


