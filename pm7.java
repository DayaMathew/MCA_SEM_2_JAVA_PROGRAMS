import java.util.Scanner;

public class pm7{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int result = a / b;     // may cause ArithmeticException
            System.out.println("Result = " + result);

            int arr[] = new int[5];
            arr[10] = 50;          // may cause ArrayIndexOutOfBoundsException
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
        }

        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        finally {
            System.out.println("Program executed.");
        }
    }
}
