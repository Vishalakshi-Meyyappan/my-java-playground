package JAVAStartedPart001;

import java.util.Scanner;

public class PrintNextNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            System.out.printf("%d", ++N);
        }
    }


/*
%d: Specifies Decimal integer.
%c: Specifies character.
%T or %t: Specifies Time and date.
%n: Inserts newline character.
 */
/*
Format Specifiers
Let’s look at the available format specifiers available for printf:

%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign
Note: %n or \n are used as line separators in printf()
 */