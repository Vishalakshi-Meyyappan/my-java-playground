package JAVAStartedPart002;

import java.util.Scanner;

public class CheckIfString2inString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        String str1 = sc.nextLine();
        if(str2.contains(str1)){
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
