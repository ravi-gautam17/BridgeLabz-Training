import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i < number; i++) {

                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
         //close the scanner
        input.close();
    }
}
