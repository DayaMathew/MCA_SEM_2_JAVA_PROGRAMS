import java.util.Scanner;

public class pm9 {

    // Method that catches and re-throws an exception
    static void divide(int a, int b) throws ArithmeticException {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Inside divide(): Division by zero");
            throw e;   // Re-throwing the exception
        }
        finally {
            System.out.println("Inside divide(): Finally block executed");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int x = sc.nextInt();
            int y = sc.nextInt();

            divide(x, y);
        }
        catch (ArithmeticException e) {
            System.out.println("Inside main(): Exception caught again");
        }
        finally {
            System.out.println("Inside main(): Finally block executed");
        }
    }
}
