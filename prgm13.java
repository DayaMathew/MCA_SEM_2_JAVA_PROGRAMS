import java.util.Scanner;

// Class representing a CString
class CString {
    private String str; // Encapsulated data member

    // Constructor
    public CString() {
        this.str = "";
    }

    // Parameterized constructor
    public CString(String str) {
        this.str = str;
    }

    // Method to read string from user
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        this.str = sc.nextLine();
    }

    // Method to display the string
    public void display() {
        System.out.println("String: " + this.str);
    }

    // Method to compare with another CString (returns Boolean)
    public boolean compare(CString other) {
        return this.str.equals(other.str);
    }

    // Method to "add" two strings (concatenation)
    public CString add(CString other) {
        return new CString(this.str + other.str);
    }

    // Method to explicitly concatenate with another string
    public void concatenate(CString other) {
        this.str = this.str + other.str;
    }

    // Getter method
    public String getString() {
        return this.str;
    }

    // Setter method
    public void setString(String str) {
        this.str = str;
    }
}

// Main class
public class prgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two CString objects
        CString s1 = new CString();
        CString s2 = new CString();

        System.out.println("Enter first string:");
        s1.read();

        System.out.println("Enter second string:");
        s2.read();

        // Display both strings
        System.out.print("\nFirst string: ");
        s1.display();
        System.out.print("Second string: ");
        s2.display();

        // Compare strings
        boolean isEqual = s1.compare(s2);
        System.out.println("\nAre the two strings equal? " + isEqual);

        // Add (concatenate) strings and return new object
        CString sum = s1.add(s2);
        System.out.print("Sum (concatenation) of strings: ");
        sum.display();

        // Concatenate second string into first string (modifies s1)
        s1.concatenate(s2);
        System.out.print("After concatenating second string into first: ");
        s1.display();

        sc.close();
    }
}
