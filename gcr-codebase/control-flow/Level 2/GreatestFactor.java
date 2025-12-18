import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        //create the scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize greatest factor to 1
        int greatestFactor = 1;

         // Loop from number - 1 down to 1
         for (int i = number - 1; i >= 1; i--) {

            // Check if number is divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit loop after finding the greatest factor
             }
         }

         // Display result
         System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        
        //close the scanner
        input.close();
    }
}
