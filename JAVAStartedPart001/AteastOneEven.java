package JAVAStartedPart001;

import java.util.Scanner;

public class AteastOneEven {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X%2==0 && Y%2!=0 && Z%2!=0) {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
}
        }
    }

