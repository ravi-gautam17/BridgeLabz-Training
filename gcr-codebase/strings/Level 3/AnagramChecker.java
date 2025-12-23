import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Call the method and display the result
        if (isAnagram(text1, text2)) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are Anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are NOT Anagrams.");
        }

        sc.close();
    }

    /**
     * Method to check if two texts are anagrams using character frequency arrays.
     */
    public static boolean isAnagram(String s1, String s2) {
        //  (remove spaces and convert to lowercase)
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        //  Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        //  Create frequency arrays for 256 ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //  Find the frequency of characters in both texts
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        //  Compare the frequency of characters
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // Frequencies don't match
            }
        }

        return true; 
    }
}