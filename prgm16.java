import java.util.Scanner;

public class prgm16{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // ---- Input elements ----
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ---- Sorting (Ascending) ----
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[i]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // ---- Print sorted array ----
        System.out.println("Array in Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
