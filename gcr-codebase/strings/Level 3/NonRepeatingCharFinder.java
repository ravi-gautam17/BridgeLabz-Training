import java.util.Scanner;

public class NonRepeatingCharFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeating(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        sc.close();
    }

    /**
     * Method to find the first non-repeating character using an ASCII frequency array.
     */
    public static char findFirstNonRepeating(String text) {
        // store the frequency of 256 ASCII characters
        int[] freq = new int[256];

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Use the ASCII value of the character as the index
            freq[currentChar]++;
        }

        // Find the first character in the string with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (freq[currentChar] == 1) {
                return currentChar; // Return the first one found
            }
        }

        // Return a null character if no unique character is found
        return '\0';
    }
}