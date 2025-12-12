/**
 * Question 8: A function takes an integer argument and returns the reverse of the same.
 * Another function takes an integer argument and returns true or false if the number
 * is a palindrome, using the above function.
 */

import java.util.Scanner;

public class prgm8 {
    
    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        
        return reversed;
    }
    
    // Function to check if a number is palindrome using reverseNumber()
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);
        
        if (isPalindrome(number))
            System.out.println(number + " is a Palindrome.");
        else
            System.out.println(number + " is NOT a Palindrome.");
        
        sc.close();
    }
}
