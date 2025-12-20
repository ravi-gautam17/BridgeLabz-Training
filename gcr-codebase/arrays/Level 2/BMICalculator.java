import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Arrays to store weight, height, BMI, and status
        double[] weight = new double[n];   // in kilograms
        double[] height = new double[n];   // in meters
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine BMI status 
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display details of each person
        System.out.println("\nBMI RESULT: \n");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

        input.close();
    }
}
