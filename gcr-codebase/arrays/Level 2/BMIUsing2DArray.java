import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array to store weight, height and BMI
        
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Input weight with validation
            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid input. Enter positive weight: ");
                weight = input.nextDouble();
            }
            personData[i][0] = weight;

            // Input height with validation
            System.out.print("Enter height (m): ");
            double height = input.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid input. Enter positive height: ");
                height = input.nextDouble();
            }
            personData[i][1] = height;
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            double bmi = personData[i][0] /
                         (personData[i][1] * personData[i][1]);

            // Store BMI
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details of each person
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " +  personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
