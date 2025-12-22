import java.util.Scanner;

public class UppercaseComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert to uppercase using user-defined method
        String manualUpper = convertToUppercase(text);

        // Convert to uppercase using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both strings using user-defined method
        boolean isEqual = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("Uppercase (User-defined): " + manualUpper);
        System.out.println("Uppercase (Built-in): " + builtInUpper);
        System.out.println("Comparison Result: " + isEqual);

        sc.close();
    }

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert lowercase to uppercase using ASCII difference
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
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
