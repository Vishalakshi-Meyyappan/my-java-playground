package ClassTestExamples;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a String: ");
        String sentence = scanner.nextLine();
        char[] Name = sentence.toCharArray();
        System.out.print("Reverse string: ");
        for(int i=Name.length - 1; i>=0; i--){  //(int i=0; i<Name.length; i++) to print the taken string as same
            System.out.print(Name[i]);

        }
        System.out.print("\n");




    }
}
