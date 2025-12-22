import java.util.Scanner;

public class LowercaseComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert to lowercase using user-defined method
        String manualLower = convertToLowercase(text);

        // Convert to lowercase using built-in method
        String builtInLower = text.toLowerCase();

        // Compare both strings using user-defined method
        boolean isEqual = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("Lowercase (User-defined): " + manualLower);
        System.out.println("Lowercase (Built-in): " + builtInLower);
        System.out.println("Comparison Result: " + isEqual);

        sc.close();
    }

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLowercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase to lowercase using ASCII difference
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

