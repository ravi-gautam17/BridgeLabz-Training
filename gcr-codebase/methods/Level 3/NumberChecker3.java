import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    public static void main(String[] args) {
        // Create the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to analyze: ");
        int num = sc.nextInt();
        
        System.out.println("\nAnalyzing Number: " + num);
        System.out.println("--------------------------------");

        // 1. Get digit count and array
        int digCount = getDigitCount(num);
        System.out.println("Digit Count: " + digCount);

        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // 2. Reverse the digits array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        // 3. Array Equality / Comparison
        boolean areSame = compareArrays(digits, reversed);
        System.out.println("Arrays match when reversed? " + areSame);

        // 4. Palindrome Check
        System.out.println("Is Palindrome? " + isPalindrome(digits));

        // 5. Duck Number Check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        
        // Close the scanner
        sc.close();
    }

    // Method to find the count of digits in the number
    public static int getDigitCount(int num) {
        if (num == 0) return 1;
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int num) {
        int count = getDigitCount(num);
        int[] digits = new int[count];
        int temp = Math.abs(num);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to Check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        // A duck number has a zero present in it
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }
}