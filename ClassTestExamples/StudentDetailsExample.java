package ClassTestExamples;

/*
Example for Variable usages 1
 */
public class StudentDetailsExample {  //class
    //Main method starts
    public static void main(String args[]) {  //main method
        StudentDetailsExample obj = new StudentDetailsExample();
        obj.StudentAge();
    }
    public void StudentAge()
    {
        //local variable age
        int age = 0;
        age = age + 5;
        System.out.println("Student age is : "+age);

    }
}

/*
                    Error creating model code for above code

public class StudentDetails {
    public static void main(String args[]) {  //main method
    System.out.println("Student age is : "+age);
    (//using local variable age outside it's scope)
    }
    public void StudentAge()
    {
        //local variable age
        int age = 0;
        age = age + 5;

    }
}
 */

//The above program does not works or provides output, since we have'nt created any object.