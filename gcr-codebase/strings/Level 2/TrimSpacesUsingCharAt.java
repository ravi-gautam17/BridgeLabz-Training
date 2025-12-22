import java.util.Scanner;

public class TrimSpacesUsingCharAt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Find start and end index after trimming spaces
        int[] indexes = findTrimIndexes(text);

        // Create substring using user-defined method
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        // Built-in trim() method
        String builtInTrim = text.trim();

        // Compare both strings
        boolean result = compareStrings(manualTrim, builtInTrim);

        // Display results
        System.out.println("After trimming (User-defined): [" + manualTrim + "]");
        System.out.println("After trimming (Built-in):     [" + builtInTrim + "]");
        System.out.println("Are both strings equal? " + result);

        sc.close();
    }

    // Method to find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = findLength(text) - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (findLength(s1) != findLength(s2)) {
            return false;
        }

        for (int i = 0; i < findLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
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
}
