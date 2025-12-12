import java.util.Scanner;

// Class representing a calculator
class Calculator {
    private double num1;
    private double num2;

    // Constructor to initialize numbers
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to add numbers
    public double add() {
        return num1 + num2;
    }

    // Method to subtract numbers
    public double subtract() {
        return num1 - num2;
    }

    // Method to multiply numbers
    public double multiply() {
        return num1 * num2;
    }

    // Method to divide numbers
    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return num1 / num2;
    }
}

// Main class
public class prgm11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Create Calculator object
        Calculator calc = new Calculator(a, b);

        // Perform operations
        System.out.println("\nResults:");
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

        sc.close();
    }
}
