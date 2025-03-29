package JAVAStartedPart002;

import java.util.Scanner;

public class Print2to5Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1.substring(2-1,5));

    }
}
