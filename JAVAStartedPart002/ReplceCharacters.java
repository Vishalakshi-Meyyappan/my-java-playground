package JAVAStartedPart002;

import java.util.Scanner;

public class ReplceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.println(str.replace(ch1, ch2));

    }
}
