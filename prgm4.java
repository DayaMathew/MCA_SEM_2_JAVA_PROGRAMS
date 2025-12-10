import java.util.Scanner;

public class prgm4 {

    // --- Bubble Sort ---
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // --- Binary Search (Iterative) ---
    public static int binarySearch(int[] arr, int key) {
        int head = 0;
        int tail = arr.length - 1;

        while (head <= tail) {
            int mid = (head + tail) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] < key)
                head = mid + 1;

            else
                tail = mid - 1;
        }
        return -1; // not found
    }

    // --- Main Method ---
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting the array
        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);

        if (index == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at position: " + (index + 1));
    }
}
