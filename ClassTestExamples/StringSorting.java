package ClassTestExamples;

import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        int count;
        Scanner S = new Scanner(System.in); //user input
        System.out.println("Enter the Count of Strings required: "); //getting integer value from user
        count=S.nextInt();
        S.nextLine();
        String str[] = new String[count]; //creating an array to store the integer value
        System.out.println("Enter the list of Strings: ");
        //since this is an array type to print them, we need to take them  by for loop manner
        for(int i=0; i<count; i++) {
            str[i] = S.nextLine(); //i-is number comes -- and printing them , so now we can print the req. number of strings
        }
    }
}