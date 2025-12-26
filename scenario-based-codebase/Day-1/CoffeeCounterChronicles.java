import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.print("Enter coffee type (espresso/latte/cappuccino) or type 'exit' to stop: ");
            String coffeeType = scanner.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting the café!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            double pricePerCup;

            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * GST_RATE;
            double finalBill = totalPrice + gstAmount;

            System.out.println("Base Price: ₹" + totalPrice);
            System.out.println("GST (18%): ₹" + gstAmount);
            System.out.println("Total Bill: ₹" + finalBill);
            System.out.println("-----------------------------------");
        }

        scanner.close();
    }
}
