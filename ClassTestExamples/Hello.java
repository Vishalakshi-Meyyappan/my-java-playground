package ClassTestExamples;

public class Hello {
    public static void main(String[] args) { //class
       String A = "Hello";
       System.out.println(A); //print using a variable
        System.out.println("Hello World");  //Directly printing the req.
    }
}



/*
To run through notepad (OLD FORMAT).
--> We have to see the location in which the classes got saved.
--> Path be : C:\User\'mypc\IdeaProjects\Test
--> Click on the req. classes --> Right click --> Open with --> Notepad
--> Close the notepad
--> Go to the folder, where you see the classes list
--> Copy the address of file in the folder taskbar
--> Now go to command prompt by --> Start --> search programs --> type cmd / Type cmd in
folder address bar.
--> Command Prompt gets opened.
--> Go to cmd --> type java -v/java -version (To check whether the java compiler is in live.
(--> If you find any issues, then --> Control panel --> System & Security --> System -->
Advanced system settings --> Environment variable --> System variable --> New --> Name -->
JAVA_HOME --> take the path address of jdk --> Paste it in value --> give OK!
Then, go to path --> Go to end of it type --> ;%JAVA_HOME\bin\ --> give OK!)
--> Kindly, Restart the computer and then do the steps to run the pgm.
--> Though it shows any error, leave it as it is, then again go bach IDE and see whether it is
running else go the Control panel --> System & Security --> System -->Advanced system settings -->
Environment variable --> System variable --> go to path --> Go to end of it type -->
;%JAVA_HOME\bin\ --> remove it and give OK! & Restart the computer and start using the IDE
to run your programmes.
--> Copy VarshaMamClassPrograms.Hello class --> Copy (From the folder)
--> Paste it in cmd / type javac VarshaMamClassPrograms.Hello.java (instead of VarshaMamClassPrograms.Hello --> use any class name you want to get
the answer) (To call the compiler to get the code) (VarshaMamClassPrograms.Hello.class File will be created and seen in
the folder)
--> Then type java VarshaMamClassPrograms.Hello.java (To call the interpreter to print the value)
--> Your answer will be viewed.
 */