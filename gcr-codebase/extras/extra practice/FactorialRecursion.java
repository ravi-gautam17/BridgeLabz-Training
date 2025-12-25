import java.util.Scanner;

public class FactorialRecursion {

    // Method to take input
    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        return n;
    }

    // Recursive method to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Method to display output
    static void displayOutput(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Main method
    public static void main(String[] args) {
        int num = getInput();                  // Input
        long fact = factorial(num);            // Calculation
        displayOutput(num, fact);              // Output
    }
}
