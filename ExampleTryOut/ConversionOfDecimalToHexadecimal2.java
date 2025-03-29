package ExampleTryOut;

import java.util.Scanner;

public class ConversionOfDecimalToHexadecimal2 {
       public static void main(String args[])
        {
            Scanner input = new Scanner( System.in );
            System.out.print("Enter a decimal number : ");
            int num =input.nextInt();

            // calling method toHexString()
            String str = Integer.toHexString(num); //using predefined method
            System.out.println("Method 1: Decimal to hexadecimal: "+str);
        }
    }

/*
public class DecimalToHexExample1{
public static void main(String args[]){
System.out.println(Integer.toHexString(10));
System.out.println(Integer.toHexString(15));
System.out.println(Integer.toHexString(289));
}
}
 */

