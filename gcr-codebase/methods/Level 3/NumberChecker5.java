import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        // Create the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to analyze: ");
        int num = sc.nextInt();
        
        System.out.println("\nAnalyzing Number: " + num);
        System.out.println("--------------------------------");

        // 1. Get the sum of proper divisors for classification
        int sumDivisors = getSumOfProperDivisors(num);
        System.out.println("Sum of Proper Divisors: " + sumDivisors);

        // 2. Check for Perfect, Abundant, or Deficient
        if (isPerfect(num, sumDivisors)) {
            System.out.println(num + " is a Perfect Number.");
        } else if (isAbundant(num, sumDivisors)) {
            System.out.println(num + " is an Abundant Number.");
        } else if (isDeficient(num, sumDivisors)) {
            System.out.println(num + " is a Deficient Number.");
        }

        // 3. Strong Number Check
        System.out.println("Is Strong Number? " + isStrong(num));
        
        // Close the scanner
        sc.close();
    }

    // Helper Method: Find the sum of proper divisors
    // Proper divisors are all divisors of a number excluding the number itself.
    public static int getSumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to Check if a number is a perfect number
    public static boolean isPerfect(int num, int sumDivisors) {
        return num > 0 && sumDivisors == num;
    }

    // Method to find if the number is an abundant number
    public static boolean isAbundant(int num, int sumDivisors) {
        return sumDivisors > num;
    }

    // Method to find if the number is a deficient number
    public static boolean isDeficient(int num, int sumDivisors) {
        return sumDivisors < num;
    }

    // Method to Check if a number is a strong number
    public static boolean isStrong(int num) {
        int originalNum = num;
        int sumFactorials = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sumFactorials += factorial(digit);
            num /= 10;
        }
        return sumFactorials == originalNum;
    }

    // Helper Method: Calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
