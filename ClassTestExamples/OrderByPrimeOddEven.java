package ClassTestExamples;

import java.util.Arrays;

public class OrderByPrimeOddEven {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 9, 22, 11, 2, 15};//the value cannot be given inside[],only count can be given, so use{}
        int[] primeArrayPrimitive = new int[7]; //creating array for storing prime numbers with storage space 7
        int[] oddArrayPrimitive = new int[7]; //creating array for storing odd numbers with storage space 7
        int[] evenArrayPrimitive = new int[7]; //creating array for storing even numbers with storage space 7
        int P = 0, E = 0, O = 0; //creating index to store and increment the respective primitives
        for (int i =0; i < arr.length; i++) { //to take each numbers all long complete array length //outer for loop
            boolean flag = false;//check prime number part
            for (int j = 2; j <= arr[i] / 2; j++) { //i++ [post increment], j++ [pre increment] //inner for loop
                // condition for nonprime number
                if (arr[i] % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                primeArrayPrimitive [P++] = arr[i];
                //if the index 1 is prime it proceed else move on to next statement and goes on.. as same
            }
            else if (arr[i] % 2 != 0) { // checking whether the number is odd or not
                oddArrayPrimitive [O++] = arr[i];
                }
            else if (arr[i] % 2 == 0) { //checking whether the number is even or not
                evenArrayPrimitive [E++] = arr[i];
            }
            }
        Arrays.sort(primeArrayPrimitive,0,P); //to the obtained value in ascending order, from 0 index to P
        Arrays.sort(oddArrayPrimitive,0,O); //to the obtained value in ascending order, from 0 index to O
        Arrays.sort(evenArrayPrimitive,0,E); //to the obtained value in ascending order, from 0 index to E
        System.out.println("The Prime numbers are: "); //optional, in-case to get sentence in output
        //Print separately or use array copy to concatenate
        for(int i=0;i<P;i++){
            System.out.println(primeArrayPrimitive[i] + ""); //to print the obtained, sorted prime array values
            }
        System.out.println("The Odd numbers are: "); //optional, in-case to get sentence in output
        for(int j=0;j<O;j++){
            System.out.println(oddArrayPrimitive[j] + ""); //to print the obtained, sorted odd array values
        }
        System.out.println("The Even numbers are: "); //optional, in-case to get sentence in output
        for(int k=0;k<E;k++){
            System.out.println(evenArrayPrimitive[k] + ""); //to print the obtained, sorted even array values
        }

        }
    }


