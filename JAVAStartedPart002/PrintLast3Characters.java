package JAVAStartedPart002;

import java.util.Scanner;

public class PrintLast3Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1.substring(str1.length()-3));

    }

}
