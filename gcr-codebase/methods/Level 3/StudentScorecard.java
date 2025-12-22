import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate scores
        int[][] pcmScores = generateScores(numStudents);
        
        // Calculate metrics
        double[][] metrics = calculateMetrics(pcmScores);
        
        // Display results
        displayScorecard(pcmScores, metrics);
        sc.close();
    }

    // Generates random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int num) {
        Random rd = new Random();
        int[][] scores = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rd.nextInt(101) ; // 0 to 100
            }
        }
        return scores;
    }

    // Calculates Total, Average, and Percentage for each student
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding to 2 digits using Math.round()
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Displays the scorecard in a tabular format using \t
    public static void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.println("ID\tPhys\tChem\tMath\tTotal\tAvg\tPerc%");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.println(metrics[i][0] + "\t" + metrics[i][1] + "\t" + metrics[i][2] + "%");
        }
    }
}