package JAVAStartedPart002;

import java.util.Scanner;
public class ConcatTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(str1+str2);
    }
}
