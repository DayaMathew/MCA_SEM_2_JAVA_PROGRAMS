import java.util.Scanner;

public class prgm10{

    // Function to print from n down to 1
    public static void displayDescending(int n) {
        if (n == 0) return;            // base case
        System.out.print(n + " ");
        displayDescending(n - 1);      // recursive call
    }

    // Function to print from 1 up to n
    public static void displayAscending(int n) {
        if (n == 0) return;            // base case
        displayAscending(n - 1);       // recursive call first
        System.out.print(n + " ");     // then print
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Numbers from n to 1: ");
        displayDescending(n);

        System.out.println();

        System.out.print("Numbers from 1 to n: ");
        displayAscending(n);

        sc.close();
    }
}
