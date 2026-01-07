import java.util.Scanner;

// User-defined exception
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class pm10{

    // Method to validate password
    static void validatePassword(String pwd) throws InvalidPasswordException {

        // Length check
        if (pwd.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }

        // Allowed characters check
        if (!pwd.matches("[A-Za-z0-9@*!{}()\\[\\]=]+")) {
            throw new InvalidPasswordException("Password contains invalid characters");
        }

        // Lowercase check
        if (!pwd.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least one lowercase letter");
        }

        // Uppercase check
        if (!pwd.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least one uppercase letter");
        }

        // Special character check
        if (!pwd.matches(".*[@*!{}()\\[\\]=].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter password:");
            String password = sc.next();

            validatePassword(password);
            System.out.println("Password is valid");

        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }
}
