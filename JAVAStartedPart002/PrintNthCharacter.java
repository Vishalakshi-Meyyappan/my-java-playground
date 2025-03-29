package JAVAStartedPart002;

import java.util.Scanner;

public class PrintNthCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int N = sc.nextInt();
        System.out.println(str1.charAt(N)); //when this is used the int value present character will be printed
        System.out.println(str1.charAt(N-1)); //when this is used the int value given by user present character will be printed
    }
}
