import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a 2D Array: 10 rows (persons), 3 columns (Weight, Height, BMI)
        double[][] persons= new double[10][3];
        String[] statuses = new String[10];

        System.out.println("--- BMI Data Entry for 10 Members ---");

        // a. Take user input and store in the 2D array
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            persons[i][0] = sc.nextDouble();
            
            System.out.print("Enter height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        //  Calculate BMI and populate the 3rd column
        calculateBMI(persons);

        //  Determine BMI status and store in the status array
        statuses = determineStatus(persons);

        // Display results
        displayResults(persons, statuses);
        
        sc.close();
    }

    /**
     * Method to find the BMI of every person
     */
    public static void calculateBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double heightInMeters = persons[i][1] / 100.0; // Convert cm to meters
            
            // Formula: BMI = weight / (height * height)
            persons[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    /**
     * Method to determine BMI status 
     */
    public static String[] determineStatus(double[][] persons) {
        String[] results = new String[persons.length];
        
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];
            
            if (bmi <= 18.4) {
                results[i] = "Underweight";
            } else if (bmi <= 24.9) {
                results[i] = "Normal";
            } else if (bmi <= 39.9) {
                results[i] = "Overweight";
            } else {
                results[i] = "Obese";
            }
        }
        return results;
    }

    /**
     * display the height, weight, BMI, and status for each individual
     */
    public static void displayResults(double[][] persons, String[] statuses) {
    System.out.println("\n--- FINAL RESULTS ---");
    
    for (int i = 0; i < persons.length; i++) {
        // Accessing each column: [0] weight, [1] height, [2] BMI
        double weight = persons[i][0];
        double height = persons[i][1];
        double bmi = persons[i][2];
        String status = statuses[i];

        System.out.println("Member " + (i + 1) + ": " +
            "Weight: " + weight + "kg  " +
            "Height: " + height + "cm  " +
            "BMI: " + bmi+
            "Status: " + status);
    }
  }
}