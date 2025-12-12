import java.util.Scanner;

public class prgm6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Read size of Matrix A ----
        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        // ---- Read size of Matrix B ----
        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        // ---- Read Matrix A ----
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // ---- Read Matrix B ----
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // ------------------ CHECK ADDITION ------------------
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nAddition is possible.");
            int[][] sum = new int[r1][c1];

            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    sum[i][j] = A[i][j] + B[i][j];

            System.out.println("Result of Addition:");
            printMatrix(sum);

        } else {
            System.out.println("\nAddition NOT possible (Matrix sizes are different).");
        }

        // ------------------ CHECK MULTIPLICATION ------------------
        if (c1 == r2) {
            System.out.println("\nMultiplication is possible.");
            int[][] product = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < c1; k++)
                        product[i][j] += A[i][k] * B[k][j];
                }
            }

            System.out.println("Result of Multiplication:");
            printMatrix(product);

        } else {
            System.out.println("\nMultiplication NOT possible (Columns of A != Rows of B).");
        }

        sc.close();
    }

    // Method to print a matrix
    static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
