import java.util.Scanner;

public class prgm7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Single statement to find minimum
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Minimum = " + min);
    }
}
