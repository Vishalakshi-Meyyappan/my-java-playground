package JAVAStartedPart001;

import java.util.Scanner;

public class TwoIntegersEqualOrNot {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X==Y) {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }
    }

