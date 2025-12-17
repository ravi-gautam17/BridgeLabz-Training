import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Read double input values
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Perform double operations based on operator precedence
        double result1 = a + b * c;   
        double result2 = a * b + c;  
        double result3 = c + a / b;   
        double result4 = a % b + c;   

        // Print the results
        System.out.println("Result of a + b * c = " + result1);
        System.out.println("Result of a * b + c = " + result2);
        System.out.println("Result of c + a / b = " + result3);
        System.out.println("Result of a % b + c = " + result4);

        // Close the scanner
        scanner.close();
    }
}
