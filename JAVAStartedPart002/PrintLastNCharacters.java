package JAVAStartedPart002;

import java.util.Scanner;

public class PrintLastNCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int N = sc.nextInt();
        System.out.println(str1.substring(str1.length()-N));

    }
}
