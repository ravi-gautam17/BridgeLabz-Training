
import java.util.*;


public class UniqueCharsFindingProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find length without .length()
        int len = findLength(input);

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(input, len);

        //  Display results
        System.out.print("Unique characters are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        
        sc.close();
    }

    // Method to find length without using String.length()
    public static int findLength(String text) {
        int count = 0;
        // Converting to char array to iterate manually
        for (char c : text.toCharArray()) {
           
            count++;
        }
        return count;
    }

    // Method to find unique characters using charAt() and nested loops
    public static char[] findUniqueCharacters(String text, int len) {
        char[] tempArray = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isDuplicate = false;

            // Inner loop: check if currentChar appeared in the string before index i
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not found previously, it's unique so far
            if (!isDuplicate) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create the final array with the exact size of unique characters found
        char[] finalUniqueArray = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueArray[i] = tempArray[i];
        }

        return finalUniqueArray;
    }
}