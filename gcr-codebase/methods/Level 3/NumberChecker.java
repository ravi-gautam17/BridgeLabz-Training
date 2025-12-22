import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        
        System.out.println("Checking Number: " + num);
        System.out.println("--------------------------------");

        // 1. Get digit count
        int count = getDigitCount(num);
        System.out.println("Digit Count: " + count);

        // 2. Store digits in array
        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        // 3. Duck Number Check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        // 4. Armstrong Number Check
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(num, digits));

        // 5. Find Largest and Second Largest
        findLargestAndSecond(digits);

        // 6. Find Smallest and Second Smallest
        findSmallestAndSecond(digits);

        sc.close();
    }

    // Method to find the count of digits
    public static int getDigitCount(int num) {
        if (num == 0) return 1;
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits in an array
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

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrongNumber(int originalNum, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == originalNum;
    }

    // Method to find largest and second largest
    public static void findLargestAndSecond(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + (second == Integer.MIN_VALUE ? "N/A" : second));
    }

    // Method to find smallest and second smallest
    public static void findSmallestAndSecond(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + (second == Integer.MAX_VALUE ? "N/A" : second));
    }
}