import java.util.Scanner;

public class prgm20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;    // discriminant

        if (D > 0) {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Two Real Roots: " + r1 + " and " + r2);
        } 
        else if (D == 0) {
            double r = -b / (2 * a);
            System.out.println("One Real Root: " + r);
        } 
        else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-D) / (2 * a);
            System.out.println("Imaginary Roots: " + real + " ± " + imag + "i");
        }
    }
}
