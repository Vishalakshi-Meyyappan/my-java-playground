package HackerEarthSums;
import java.util.Scanner;

public class TravelAgencyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] arr = new TravelAgencies[4]; // in question they have given 4 travel agencies details
        for (int i = 0; i < 4 ; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            boolean e = sc.nextBoolean();
            sc.nextLine();

            arr [i] = new TravelAgencies(a,b,c,d,e);
        }

        int inputregno = sc.nextInt();
        sc.nextLine();
        String inputpackagetype = sc.nextLine(); // getting the value to be searched from user

       int max =  findAgencyWithinHighestPackagePrice (arr); // calling the value
        System.out.println(max); //printing the value

        TravelAgencies result = agencyDetailsForGivenIdAndType(arr,inputregno, inputpackagetype);
        System.out.println(result.agencyName+ ":"+result.price);
    }

    public static int findAgencyWithinHighestPackagePrice(TravelAgencies[] arr) {

        int max = arr[0].price;
        for (int i = 1; i<arr.length; i++) {
            if (arr [i].price<max) { //comparing max & price
                max = arr[i].price; // assigning the price
            }
        }
        return max;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr, int regno, String packagetype) {
        for (int i = 0; i <4; i++) {
            if(arr[i].flightFacility==true) {
                if (arr[i].regNo==regno && arr[i].packageType.equals(packagetype))
                {
                    return arr[i];
                }
            }
        }
        return null;
    }
}

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    //constructor

    public TravelAgencies(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // Getter & Setters
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
