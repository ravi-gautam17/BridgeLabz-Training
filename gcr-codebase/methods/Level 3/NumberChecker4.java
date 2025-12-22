import java.util.Scanner;

public class NumberChecker4 {

    public static void main(String[] args) {
        // Create the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to analyze: ");
        int num = sc.nextInt();
        
        System.out.println("\nAnalyzing Number: " + num);
        System.out.println("--------------------------------");

        // 1. Prime Number Check
        System.out.println("Is Prime Number? " + isPrime(num));

        // 2. Neon Number Check
        System.out.println("Is Neon Number? " + isNeon(num));

        // 3. Spy Number Check
        System.out.println("Is Spy Number? " + isSpy(num));

        // 4. Automorphic Number Check
        System.out.println("Is Automorphic Number? " + isAutomorphic(num));

        // 5. Buzz Number Check
        System.out.println("Is Buzz Number? " + isBuzz(num));
        
        // Close the scanner
        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = Math.abs(num);
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        // Check if square ends with the number
        // We use String.endsWith or math logic
        String s1 = Integer.toString(num);
        String s2 = Integer.toString(square);
        return s2.endsWith(s1);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int num) {
        // Divisible by 7 OR ends with 7
        return (num % 7 == 0) || (num % 10 == 7);
    }
}