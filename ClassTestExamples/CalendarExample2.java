package ClassTestExamples;
import static java.util.Calendar.WEEK_OF_YEAR; //importing the value
public class CalendarExample2 {
    public static void main(String[] args) { //Main method
        System.out.println(WEEK_OF_YEAR);  //Printing the imported package value
    }
}

//Here, this program shows the usage of package which is imported from JDK
//WEEK_OF_YEAR package prints 3 as its value as in JDK import explanation entered number is 3.
//To find the import packages steps are as follows
//External Libraries --> rt.jar --> java --> util --> Calendar (you can use what ever package you need)
//(Since I need to print the calendar values, I'm choosing Calendar package and there we can take what ever packages we need.
//Select the Capitalised name which is called as Package names.
