class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Two Student objects using the same class
        Student student1 = new Student("Rahul", 85);
        Student student2 = new Student("Priya", 92);

        student1.display();

        System.out.println();

        student2.display();
    }
}
