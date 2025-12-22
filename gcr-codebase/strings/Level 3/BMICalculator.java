import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // Store weight and height

        // a. Take user input for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble(); // First column: weight
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble(); // Second column: height
        }

        // c. Call method to process data and store in 2D String array
        String[][] finalResults = processBMIResults(data);

        // d. Display the final scorecard
        displayResults(finalResults);
        
        sc.close();
    }

    // b. Method to find BMI and Status for a single person
    public static String[] getIndividualBMI(double weight, double heightCm) {
        // Convert cm to meter
        double heightM = heightCm / 100.0;
        
        // Formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        // Determine status based on provided table
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        // Format BMI to 2 decimal places and return as String array
        return new String[]{String.format("%.2f", bmi), status};
    }

    // c. Method to compute all BMI data and store in a 2D String array
    public static String[][] processBMIResults(double[][] inputData) {
        String[][] results = new String[10][4]; // Columns: Height, Weight, BMI, Status
        
        for (int i = 0; i < 10; i++) {
            double weight = inputData[i][0];
            double height = inputData[i][1];
            
            // Call the individual calculation method
            String[] bmiAndStatus = getIndividualBMI(weight, height);
            
            results[i][0] = String.valueOf(height);
            results[i][1] = String.valueOf(weight);
            results[i][2] = bmiAndStatus[0]; // BMI
            results[i][3] = bmiAndStatus[1]; // Status
        }
        return results;
    }

    // d. Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\n--- BMI SCORECARD ---");
        System.out.println("Height\tWeight\tBMI\tStatus");
        System.out.println("---------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + 
                               results[i][1] + "\t" + 
                               results[i][2] + "\t" + 
                               results[i][3]);
        }
    }
}