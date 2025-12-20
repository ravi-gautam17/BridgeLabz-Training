import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int maxDigit = 10;

        // Array to store digits of the number
        int[] digits = new int[maxDigit];

        int index = 0;

        // Loop to extract digits and store them in the array
        while (number != 0) {

            // Stop if array size limit is reached
            if (index == maxDigit) {
                break;
            }

            digits[index] = number % 10;

            number = number / 10;

            index++;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
