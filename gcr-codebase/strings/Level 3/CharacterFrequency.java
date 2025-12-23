import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get frequencies in a 2D String array
        String[][] frequencyData = getFrequencyArray(input);

        // Display the results
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("Char\tFrequency");
        System.out.println("-------------------");
        for (int i = 0; i < frequencyData.length; i++) {
            if (frequencyData[i][0] != null) {
                System.out.println(frequencyData[i][0] + "\t" + frequencyData[i][1]);
            }
        }
        sc.close();
    }

    public static String[][] getFrequencyArray(String text) {
        //  Create frequency array for 256 ASCII characters
        int[] freq = new int[256];

        //  Loop through text to count frequencies using charAt()
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++; // ASCII value of 'c' acts as the index
        }

        // Create a 2D String array to store character and its frequency

        String[][] result = new String[256][2];
        int resultIndex = 0;

        // Store unique characters and their counts in the 2D array
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Only process if frequency is > 0 (meaning it's in the text)

            if (freq[c] > 0) {
                boolean alreadyAdded = false;
                for (int j = 0; j < resultIndex; j++) {
                    if (result[j][0].equals(String.valueOf(c))) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    result[resultIndex][0] = String.valueOf(c);
                    result[resultIndex][1] = String.valueOf(freq[c]);
                    resultIndex++;
                }
            }
        }

        // Return the 2D array (only the filled portion is needed)
        String[][] finalOutput = new String[resultIndex][2];
        for (int i = 0; i < resultIndex; i++) {
            finalOutput[i] = result[i];
        }
        return finalOutput;
    }
}