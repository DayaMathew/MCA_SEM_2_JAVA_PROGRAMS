/**
 * This program demonstrates:
 * 1. Passing entire array to a method
 * 2. Modifying array elements in a method
 * 3. Passing array elements individually
 */

import java.util.Scanner;

public class Prgm5 {
    
    // Method 1: Pass entire array and display it
    public static void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Method 2: Pass array and modify its elements
    public static void modifyArray(int[] arr) {
        System.out.println("\nModifying array elements (multiplying by 2)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
    
    // Method 3: Pass individual array element
    public static void displayElement(int element, int index) {
        System.out.println("Element at index " + index + ": " + element);
    }
    
    // Method 4: Pass array and return sum
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\n=== Demonstrating Different Ways to Pass Arrays ===\n");
        
        // 1. Passing entire array to display
        System.out.println("1. Passing entire array to display:");
        displayArray(numbers);
        
        // 2. Passing individual elements
        System.out.println("\n2. Passing individual array elements:");
        for (int i = 0; i < numbers.length; i++) {
            displayElement(numbers[i], i);
        }
        
        // 3. Passing array to calculate sum
        System.out.println("\n3. Passing array to calculate sum:");
        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements: " + sum);
        
        // 4. Passing array by reference (modifying original array)
        System.out.println("\n4. Passing array by reference (demonstrates modification):");
        System.out.println("Before modification:");
        displayArray(numbers);
        
        modifyArray(numbers);
        
        System.out.println("After modification:");
        displayArray(numbers);
        
        System.out.println("\nNote: Arrays in Java are passed by reference,");
        System.out.println("so modifications inside methods affect the original array.");
        
        sc.close();
    }
}