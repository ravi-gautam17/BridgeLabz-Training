import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        //  common to ignore case and spaces for true palindromes
        String cleanInput = input.toLowerCase().replaceAll("\\s+", "");

        System.out.println("\n--- Palindrome Check Results ---");

        // Logic 1: Iterative
        System.out.println("Logic 1 (Iterative): " + (isPalindromeIterative(cleanInput) ? "Yes" : "No"));

        // Logic 2: Recursive
        System.out.println("Logic 2 (Recursive): " + (isPalindromeRecursive(cleanInput, 0, cleanInput.length() - 1) ? "Yes" : "No"));

        // Logic 3: Character Array Reverse
        System.out.println("Logic 3 (Reverse Array): " + (isPalindromeReverse(cleanInput) ? "Yes" : "No"));

        sc.close();
    }

    // Logic 1: Compare from start and end using a loop
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if we have checked all characters
        if (start >= end) {
            return true;
        }
        // If characters don't match, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original with a reversed character array
    public static boolean isPalindromeReverse(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        // Reverse using charAt() logic
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reverse arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
}