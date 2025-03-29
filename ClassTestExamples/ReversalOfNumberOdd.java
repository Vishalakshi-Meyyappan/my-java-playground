package ClassTestExamples;

import java.util.Scanner;
public class ReversalOfNumberOdd {
    public static void main(String[] args) {
        int ab, reversenum=0;
        int num = 0;
        Scanner sc = new Scanner (System.in);
        ab=sc.nextInt();
        if(ab%2!=0) {
            //int num = 0;
            for(;num != 0; )
            {
                reversenum = reversenum * 10;
                reversenum = reversenum + num%10;
                num = num/10;
            }
           
//            for(;num!= 0; num /= 10) {
//                int digit = num % 10;
//                rev = rev * 10 + digit;
//            }

            System.out.println(reversenum);
        }
        else
            System.out.println("Cannot reverse");
    }
}
