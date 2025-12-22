import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input using next()
        System.out.print("Enter the string: ");
        String text = sc.next();

        // Calling user-defined method
        int manualLength = findLength(text);

        // Using built-in method for comparison
        int builtInLength = text.length();

        // Display results
        System.out.println("Length (User-defined): " + manualLength);
        System.out.println("Length (Built-in): " + builtInLength);

        sc.close();
    }

    // Method to find string length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            // Infinite loop
            for (int i = 0; ; i++) {
                text.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }
}
