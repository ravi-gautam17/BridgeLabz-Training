import java.util.Scanner;

public class SplitTextAndCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined split method
        String[] manualWords = splitText(text);

        // Built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean result = compareStringArrays(manualWords, builtInWords);

        // Display result
        System.out.println("Are both word arrays equal? " + result);

        sc.close();
    }

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                text.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates end of string
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}
