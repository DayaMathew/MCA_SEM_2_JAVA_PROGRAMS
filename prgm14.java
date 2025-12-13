import java.util.Scanner;

// Class representing a Student
class Student {
    private int sno;           // Student number
    private String sname;      // Student name
    private String sprogram;   // Program (e.g., MCA)

    // Default constructor
    public Student() {
        this.sno = 0;
        this.sname = "";
        this.sprogram = "";
    }

    // Parameterized constructor
    public Student(int sno, String sname, String sprogram) {
        this.sno = sno;
        this.sname = sname;
        this.sprogram = sprogram;
    }

    // Method to read student details
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student number: ");
        this.sno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter student name: ");
        this.sname = sc.nextLine();
        System.out.print("Enter student program: ");
        this.sprogram = sc.nextLine();
    }

    // Method to display student details
    public void display() {
        System.out.println("\nStudent Number: " + this.sno);
        System.out.println("Student Name: " + this.sname);
        System.out.println("Student Program: " + this.sprogram);
    }

    // Method to compare two students
    public boolean isEqual(Student other) {
        return this.sno == other.sno &&
               this.sname.equalsIgnoreCase(other.sname) &&
               this.sprogram.equalsIgnoreCase(other.sprogram);
    }

    // Getters and Setters (optional)
    public int getSno() { return sno; }
    public String getSname() { return sname; }
    public String getSprogram() { return sprogram; }

    public void setSno(int sno) { this.sno = sno; }
    public void setSname(String sname) { this.sname = sname; }
    public void setSprogram(String sprogram) { this.sprogram = sprogram; }
}

// Main class
public class prgm14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("Enter details for first student:");
        student1.read();

        System.out.println("\nEnter details for second student:");
        student2.read();

        // Display student details
        System.out.println("\nFirst student details:");
        student1.display();

        System.out.println("\nSecond student details:");
        student2.display();

        // Compare two students
        if (student1.isEqual(student2)) {
            System.out.println("\nThe two students are equal.");
        } else {
            System.out.println("\nThe two students are NOT equal.");
        }

        sc.close();
    }
}
