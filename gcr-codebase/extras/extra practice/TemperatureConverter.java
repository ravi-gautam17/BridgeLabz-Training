import java.util.Scanner;

public class TemperatureConverter {

    // Method to take input
    static double getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double val=sc.nextDouble();
        sc.close();
        return val;
        
    }

    // Method to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Method to display output
    static void displayOutput(double result) {
        System.out.println("Converted temperature: " + result);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        double temp = getInput();
        double result;

        if (choice == 1) {
            result = celsiusToFahrenheit(temp);
            displayOutput(result);
        } else if (choice == 2) {
            result = fahrenheitToCelsius(temp);
            displayOutput(result);
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
