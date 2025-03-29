package SkillRackProblems;
import java.util.Scanner;

public class CarMileageSumSkillRack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars : ");
        int cars = sc.nextInt();
        float[] mileages = new float[cars];
        int[][] FuelDistance = new int[cars][2];
        for(int i=0; i<cars; i++){

        }

    }
}


/*
//Simpler Version of printing
public class CarMileageSumSkillRack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars : ");
        int cars = sc.nextInt();
        for(int i=0; i<cars; i++){
            System.out.println("Enter the KM travelled by car ");
            int carKM = sc.nextInt();
            System.out.println("Enter the Petrol consumed by car : ");
            int carPetrolConsumption = sc.nextInt();
            int CarValue = carKM / carPetrolConsumption;
            System.out.println("Value of Car : " + CarValue);

        }

    }
 */