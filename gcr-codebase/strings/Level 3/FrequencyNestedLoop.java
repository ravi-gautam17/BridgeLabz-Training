import java.util.Scanner;

public class FrequencyNestedLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get results
        String[] result = findFrequency(input);

        // Display results
        System.out.println("\nCharacter Frequencies:");
        for (String entry : result) {
            System.out.println(entry);
        }
        
        sc.close();
    }

    public static String[] findFrequency(String text) {
        // Convert string to char array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Nested Loop Logic
        for (int i = 0; i < chars.length; i++) {
            // Skip characters already marked as '0' (duplicates)
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1; // Initialize frequency to 1
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;       
                    chars[j] = '0';   
                }
            }
        }

        // Count how many unique characters (excluding the '0' markers) we found
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (text.charAt(i) != '0' && chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Store characters and frequencies in a 1D String array
        String[] finalResult = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                finalResult[index] = chars[i] + " occurs " + freq[i] + " times";
                index++;
            }
        }

        return finalResult;
    }
}