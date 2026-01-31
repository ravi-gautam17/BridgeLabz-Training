package functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        // Function to calculate length of a string
        Function<String, Integer> stringLengthFunction = message -> message.length();

        String message = "Welcome to Java Functional Programming";
        int characterLimit = 30;

        // Applying the function
        int messageLength = stringLengthFunction.apply(message);

        // Checking if length exceeds limit
        if (messageLength > characterLimit) {
            System.out.println("Message exceeds the character limit.");
        } else {
            System.out.println("Message is within the character limit.");
        }

        // Optional: Print length for clarity
        System.out.println("Message Length: " + messageLength);
    }
}
