package ClassTestExamples;

public class StudentMarkDetailsExample2 {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        if (testscore >= 60) {
            grade = 'D';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 90) {
            grade = 'A';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
