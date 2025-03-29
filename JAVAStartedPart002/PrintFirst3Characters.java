package JAVAStartedPart002;

import java.util.Scanner;

public class PrintFirst3Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1.substring(0,3));

    }
}
