package ClassTestExamples;

public class MyParameterizedConstructor {
    private String name;
    public MyParameterizedConstructor(String str) {
        this.name = str;
        System.out.println("I am inside Parameterized Constructor");
        System.out.println("The Parameter Value is: "+str);
    }

    public static void main(String[] args) {
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("Rudraksh");
    }
}
