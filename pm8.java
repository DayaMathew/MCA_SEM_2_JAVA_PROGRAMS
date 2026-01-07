import java.util.Scanner;

// Step 1: Create user-defined exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class pm8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            // Step 2: Check condition
            if (age < 18) {
                throw new InvalidAgeException("Age is below 18. Not eligible!");
            }

            System.out.println("You are eligible.");
        }

        catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}

