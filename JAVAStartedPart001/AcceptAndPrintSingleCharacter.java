package JAVAStartedPart001;

import java.util.Scanner;

public class AcceptAndPrintSingleCharacter {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(4); //input the appropriate index character to be printed
            System.out.print(ch);
        }
    }


