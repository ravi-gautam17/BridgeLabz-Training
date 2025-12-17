import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {

        // Create Scanner object to take input 
        Scanner scanner = new Scanner(System.in);

        // Read number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println(
            "The maximum number of possible handshakes is " + maximumHandshakes
        );

        // Close the scanner
        scanner.close();
    }
}
