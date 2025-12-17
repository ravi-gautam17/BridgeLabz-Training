import java.util.Scanner;

public class TotalPurchaseCalculator {

    public static void main(String[] args) {

        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read unit price of the item
        System.out.print("Enter unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        // Read quantity of the item
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        // Close the scanner
        scanner.close();
    }
}
