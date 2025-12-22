import java.util.Scanner;

public class WordsAndLengths2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split text into words (user-defined)
        String[] words = splitText(text);

        // Create 2D array of words and their lengths
        String[][] wordLengthTable = createWordLengthTable(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int wordCount = 1;

        // Count words
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    wordCount++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndexes[index++] = i;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, findLength(text));

        return words;
    }

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                text.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }
}

