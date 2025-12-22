import java.util.Scanner;

public class VowelsAndConsonantsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Find count of vowels and consonants
        int[] result = findVowelsAndConsonants(text);

        // Display result
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        sc.close();
    }

    // Method to check whether a character is vowel or consonant
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = checkCharacter(ch);

                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }

            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }
}
