package ClassTestExamples;
import java.util.Scanner;

public class SquareOfUnitDigits {
    public static void main(String[] args) {
        int Count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Count: "); //get the input from user
        Count = sc.nextInt();
        sc.nextLine(); //this is used to make the number pointer to shift down
        int[] arr = new int[Count]; //creating array, to store and get the count
        System.out.println("Enter the " +Count+ " Numbers: ");
        for (int i=0; i<=Count; i++){ //array is printed only with the help of for loop
            arr[i] = sc.nextInt(); //calling the array
            System.out.println((int)Math.pow(arr[i] % 10,2));
            //[Math.pow(double a, double b) --> is used to print the sq. of a number like double a ^ double b]
            //arr[i] % 10 --> is used to give the reminder, so that we can get the last digit of each number
            //Math.pow(arr[i] % 10,2) --> this is actually gives result as double.
            //--> so to get into integer we are type casting it.

        }

    }

}

/*

 */