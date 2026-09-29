public class StudentGrade {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 70) {
            System.out.println("Student has passed the exam.");

            if (marks > 90) {
                System.out.println("Grade: A");
            }
        } else {
            System.out.println("Student has failed the exam.");
        }
    }
}
