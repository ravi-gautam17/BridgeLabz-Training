import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of students (as per question = 10)
        int n = 10;

        // Generate random ages for students
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayTable(result);

        sc.close();
    }

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {

        int[] ages = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90); 
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            // Validate negative age
            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            // Check voting condition
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
