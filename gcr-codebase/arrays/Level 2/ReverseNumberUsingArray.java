import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        // create the scanner object
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;  

        //  Find the count of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Array to store digits of the number
        int[] digits = new int[count];

        // Step 2: Store digits in the array
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Create another array to store reversed digits
        int[] reverseDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        //Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        input.close();
    }
}
