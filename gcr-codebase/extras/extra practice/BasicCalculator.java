import java.util.Scanner;

public class BasicCalculator {

    // Method to take input
    static double[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        sc.close();
        return new double[]{a, b};
    
    }

    // Addition
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Display output
    static void displayOutput(double result) {
        System.out.println("Result: " + result);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Basic Calculator ----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation: ");
        int choice = sc.nextInt();
       
        double[] numbers = getInput();
        double result;

        switch (choice) {
            case 1:
                result = add(numbers[0], numbers[1]);
                break;
            case 2:
                result = subtract(numbers[0], numbers[1]);
                break;
            case 3:
                result = multiply(numbers[0], numbers[1]);
                break;
            case 4:
                result = divide(numbers[0], numbers[1]);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        displayOutput(result);
      
    }
}
