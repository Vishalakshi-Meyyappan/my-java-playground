package ExampleTryOut;

import java.util.Scanner;

public class ConversionOfOctalToBinary {


        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
            long octal_num, tempoctal_num, binary_num, place;
            int rem;
            System.out.print("Input any octal number: ");
            octal_num = in.nextLong();
            tempoctal_num = octal_num;
            binary_num = 0;
            place = 1;
            while (tempoctal_num != 0)
            {
                rem = (int)(tempoctal_num % 10);
                binary_num = octal_numvalues[rem] * place + binary_num;
                tempoctal_num /= 10;
                place *= 1000;
            }
            System.out.print("Equivalent binary number: " + binary_num+"\n");
        }
    }


