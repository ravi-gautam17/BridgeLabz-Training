import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        // Read second number
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Calculate quotient using division operator
        int quotient = number1 / number2;

        // Calculate remainder using modulus operator
        int remainder = number1 % number2;

        // Display the result in required format
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 + " and " + number2
        );

        // Close the scanner
        scanner.close();
    }
}
