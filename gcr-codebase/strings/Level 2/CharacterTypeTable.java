import java.util.Scanner;

public class CharacterTypeTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete string input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Generate 2D array of character and its type
        String[][] result = analyseCharacters(text);

        // Display result in tabular format
        displayTable(result);

        sc.close();
    }

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to analyse characters in a string and return a 2D array
    public static String[][] analyseCharacters(String text) {

        int length = findLength(text);
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
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

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}

