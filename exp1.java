class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    void calculateGrade() {
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}

public class exp1{
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, 92.5);
        Student s2 = new Student("Bob", 2, 68.0);

        s1.displayInfo();
        s1.calculateGrade();

        System.out.println();

        s2.displayInfo();
        s2.calculateGrade();
    }
}
