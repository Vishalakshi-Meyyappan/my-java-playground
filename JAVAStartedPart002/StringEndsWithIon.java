package JAVAStartedPart002;

import java.util.Scanner;

public class StringEndsWithIon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if(str1.endsWith("ion")){
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
