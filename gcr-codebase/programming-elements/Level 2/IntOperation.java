import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();

        // Perform integer operations based on operator precedence
        int result1 = a + b * c;   
        int result2 = a * b + c;   
        int result3 = c + a / b;   
        int result4 = a % b + c;  

        // Print the results
        System.out.println("Result of a + b * c = " + result1);
        System.out.println("Result of a * b + c = " + result2);
        System.out.println("Result of c + a / b = " + result3);
        System.out.println("Result of a % b + c = " + result4);

        // Close the scanner
        scanner.close();
    }
}
