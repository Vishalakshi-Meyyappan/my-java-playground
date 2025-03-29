package JAVAStartedPart002;

import java.util.Scanner;

public class StringStartsWithPan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if(str1.startsWith("Pan")){
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
