/*
QUESTION :
Read different types of data from standard input, process them as shown in output format and
print the answer to standard output.

Input format:
First line contains integer N.
Second line contains string S.

Output format:
First line should contain N x 2.
Second line should contain the same string S.
 */
package HackerEarthSums;

import java.util.Scanner;

public class StandardOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        System.out.println(N*2);
        System.out.println(S);

    }

}
