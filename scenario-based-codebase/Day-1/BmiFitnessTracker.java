import java.util.Scanner;

public class BmiFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input height in meters
        System.out.print("Enter height (in meters): ");
        double heightInMeters = scanner.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter weight (in kilograms): ");
        double weightInKg = scanner.nextDouble();

        // BMI formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);

        // BMI category check
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }
}
