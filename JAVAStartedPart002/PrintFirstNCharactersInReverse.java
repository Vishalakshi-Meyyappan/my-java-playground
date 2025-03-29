package JAVAStartedPart002;

import java.util.Scanner;

public class PrintFirstNCharactersInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse().toString());
    }
}
