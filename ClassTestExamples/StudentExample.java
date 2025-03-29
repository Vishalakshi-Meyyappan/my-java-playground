package ClassTestExamples;

public class StudentExample {   //class name

    static String Semester = "six"; //value does not change, so what static is used (has only one value)
    int studentId;  //value changes,(Instance variable, used outside the main method, with different values)
    String studentName; //value changes,(Instance variable, used outside the main method, with different values)
    //Main method starts
    public static void main(String[] args)  //main method
    {
        StudentExample s1 = new StudentExample();  //creating object 1
        StudentExample s2 = new StudentExample(); //creating object 2
        s1.studentId = 1;   //assigning value for student Id 1
        s2.studentId = 2;  //assigning value for student Id 2
        s1.studentName = "Syed";    //assigning value for student Name 1

        s2.studentName = "Visha";    //assigning value for student Name 2
        System.out.println(s1.studentId + Semester + s1.studentName);   //Printing the values

        System.out.println(s2.studentId + Semester + s2.studentName);  //Printing the values
//Main method ends

    }
}
