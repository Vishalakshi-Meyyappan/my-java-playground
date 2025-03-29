package JAVAStartedPart002;

import java.util.Scanner;
public class ConvertStringIntoCharacterArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        // Creating array of string length
        char[] ch = str1.toCharArray();

        // Copy character by character into array
        for (int i=0;i<ch.length;i++) {
            System.out.print(ch[i] + " ");
        }
    }
}

/*
Another method
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        // Creating array of string length
        char[] ch = new char[str1.length()];

        // Copy character by character into array
        for (int i = 0; i < str1.length(); i++) {
            ch[i] = str1.charAt(i);
        }

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
    }
 */