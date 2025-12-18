import java.util.Scanner;

public class FizzBuzzProgram{

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {


                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }

                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }

                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if none of the above conditions match
                else {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        input.close();
    }
}
