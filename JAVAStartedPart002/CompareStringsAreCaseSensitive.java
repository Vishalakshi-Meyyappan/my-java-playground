package JAVAStartedPart002;

import java.util.Scanner;

public class CompareStringsAreCaseSensitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.equals(str2)){ // if(str1.equals(str2)==true) also can be used //equals() is a function provided by java
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }

    }
}
