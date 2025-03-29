package SkillRackProblems;

import java.util.Scanner;

public class ChocolateRemainingSkillRack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int C = sc.nextInt();
        int N = sc.nextInt();
        int R;
        int D = 6; //since in question they need 30 so do the formulated as typed below; in-case need user input do as such.

        R = C - N * D;
        System.out.println(R);
    }
}

/*
300 - 45 * n = 30
300 - 45n = 30
- 45n = 30 - 300
-45 n = -270
n = 270 / 45
n = 6
 */