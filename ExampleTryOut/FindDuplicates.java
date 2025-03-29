package ExampleTryOut;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates<duplicates> {
    public static void main (String[] args) {
    int [] array = {1,2,3,4,5,6,5,4,3,9,6,5,3};
    Set <Integer> duplicates = findDuplicates (array);
    System.out.println("Duplicates: " + duplicates);
    }

    public static Set <Integer> findDuplicates (int [] arr) {
        Set <Integer> value = new HashSet<>();
        Set <Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!value.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
   }
}