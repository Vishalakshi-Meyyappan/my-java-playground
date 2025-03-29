package JAVAStartedPart002;

import java.util.Scanner;

public class PrintingNCharacterToMCharater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int n = sc.nextInt(); //in case of user intake integer else you can directly define the value to be printed
        int m = sc.nextInt();
        System.out.println(str1.substring(n-1,m));

    }
}
