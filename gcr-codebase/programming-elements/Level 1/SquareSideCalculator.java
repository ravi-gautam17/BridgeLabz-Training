import java.util.Scanner;

public class SquareSideCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Read the perimeter of the square from the user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Formula: Perimeter of square = 4 * side
        // So, side = perimeter / 4
        double sideLength = perimeter / 4;

        // Print the result in the required format
        System.out.println(
            "The length of the side is " + sideLength + " whose perimeter is " + perimeter
        );

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
