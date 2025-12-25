import java.util.Scanner;

public class GCD_LCM_Calculator {

    // Method to take input
    static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        return new int[]{a, b};
    }

    // Method to calculate GCD using Euclidean Algorithm
    static int calculateGCD(int a, int b) {
        if (b == 0)
            return a;
        return calculateGCD(b, a % b);
    }

    // Method to calculate LCM
    static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Method to display output
    static void displayOutput(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = getInput();               // Input
        int gcd = calculateGCD(numbers[0], numbers[1]); // GCD
        int lcm = calculateLCM(numbers[0], numbers[1]); // LCM
        displayOutput(numbers[0], numbers[1], gcd, lcm); // Output
    }
}
