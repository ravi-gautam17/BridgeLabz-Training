import java.util.Scanner;

public class ShortestAndLongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split text into words (user-defined)
        String[] words = splitText(text);

        // Create 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Find shortest and longest word indexes
        int[] resultIndexes = findShortestAndLongest(wordLengthArray);

        // Display results
        System.out.println("\nShortest Word: " 
                + wordLengthArray[resultIndexes[0]][0]
                + " (Length: " 
                + Integer.parseInt(wordLengthArray[resultIndexes[0]][1]) + ")");

        System.out.println("Longest Word: " 
                + wordLengthArray[resultIndexes[1]][0]
                + " (Length: " 
                + Integer.parseInt(wordLengthArray[resultIndexes[1]][1]) + ")");

        sc.close();
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int wordCount = 1;

        // Count words using charAt()
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
    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {

        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(wordLengthArray[0][1]);
        int maxLength = Integer.parseInt(wordLengthArray[0][1]);

        for (int i = 1; i < wordLengthArray.length; i++) {

            int currentLength = Integer.parseInt(wordLengthArray[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
