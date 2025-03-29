package ClassTestExamples;

import java.util.ArrayList;

public class ArrayInsertionExample {

    public static void main(String[] args) {
        int arr[] = new int[5];//[5] array of fixed value //declaration
        arr[0] = 2;//assigning the values
        arr[1] = 4;//assigning the values
        arr[2] = 6;//assigning the values
        //arr[3] = 4;//assigning the values
       //arr[4] = 6;//assigning the values
       // if we remove few i/p values, the corresponding values spaces print as '0'. why because the default value of integer is Zero.
        arr[2] = 12; //it replaces the value of arr[2]
        for (int i = 0; i < arr.length; i++) {
            //i < 5 (5 is our fixed value) else we can use arr.length (which takes itself the given fixed range)
            //always array pgm should have for loop because then only array will print.
            System.out.println(arr[i]); //printing the appropriate value
        }
        //program using array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        //numbers.set(2, 12); //set is used to replace the values
        numbers.add(2, 12); //this is used to add 12 in 2, this will print [2, 4, 12, 6, 8, 10].

        System.out.println(numbers);

    }

}

