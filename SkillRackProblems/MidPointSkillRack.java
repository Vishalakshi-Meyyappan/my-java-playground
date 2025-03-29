package SkillRackProblems;

import java.util.Scanner;

public class MidPointSkillRack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float X1 = sc.nextInt();
        float Y1 = sc.nextInt();
        float X2 = sc.nextInt();
        float Y2 = sc.nextInt();
        System.out.println((X1 + X2) / 2);
        System.out.println((Y1 + Y2) / 2);
    }

}
