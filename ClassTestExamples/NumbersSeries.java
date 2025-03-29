package ClassTestExamples;

public class NumbersSeries {
    public static void main(String[] args) {
        int A = 0; //First number to be printed by itself
        int B = 1; //Second number to be printed by itself
        int count = 10; //Total no.of output to be printed
        int C; //Third number used for helping

        System.out.print(A + "," + B);
        //printing first & second values..
        //" " <-- this is used to give space between the numbers
        // "," <-- this is used to give comma between the numbers

        for (int i = 2; i < count; i++) {
            C = A+B; //to print rest all digits

            System.out.print(","+C);
            A = B;
            B = C;

        }


    }
}

