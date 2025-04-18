package JAVAStartedPart001;

public class Print11And11 {
        public static void main(String[] args) {
            int N = 10;
            System.out.printf("%d %d", ++N, N++);
        }
    }

/*
Java printf()
**printf() method is not only there in C, but also in Java.
**This method belongs to the PrintStream class.
**It’s used to print formatted strings using various format specifiers.
**printf() uses the java.util.Formatter class to parse the format string and generate the output.
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
