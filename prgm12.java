import java.util.Scanner;

// Class representing a complex number
class Complex {
    private double real;
    private double imag;

    // Constructor
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Parameterized constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to read complex number from user
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        this.real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        this.imag = sc.nextDouble();
    }

    // Method to display complex number
    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    // Method to add two complex numbers
    public Complex add(Complex c) {
        double r = this.real + c.real;
        double i = this.imag + c.imag;
        return new Complex(r, i);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex c) {
        double r = (this.real * c.real) - (this.imag * c.imag);
        double i = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(r, i);
    }
}

// Main class
public class prgm12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two complex numbers
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.read();

        System.out.println("\nEnter second complex number:");
        c2.read();

        // Display the complex numbers
        System.out.print("\nFirst complex number: ");
        c1.display();
        System.out.print("Second complex number: ");
        c2.display();

        // Add the complex numbers
        Complex sum = c1.add(c2);
        System.out.print("\nSum: ");
        sum.display();

        // Multiply the complex numbers
        Complex product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();

        sc.close();
    }
}
