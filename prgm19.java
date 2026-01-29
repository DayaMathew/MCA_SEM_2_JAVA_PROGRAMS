import java.util.Scanner;

public class prgm19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns (c): ");
        int c = sc.nextInt();

        int A[][] = new int[r][c];
        int T[][] = new int[c][r];   // transpose matrix

        // Input matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Compute transpose
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                T[j][i] = A[i][j];  // swap row & column
            }
        }

        // Print transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}
