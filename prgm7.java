import java.util.Scanner;

public class prgm7{

    // Function to return maximum of two numbers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        // Using max() function to get maximum of three numbers
        int maxOfThree = max(max(x, y), z);

        System.out.println("Maximum of the three numbers = " + maxOfThree);

        sc.close();
    }
}
