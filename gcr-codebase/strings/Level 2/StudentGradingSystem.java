import java.util.Random;

public class StudentGradingSystem {

    public static void main(String[] args) {
        int numStudents = 5; // You can change the number of students here

        // a. Generate random scores
        int[][] pcmScores = generateRandomScores(numStudents);

        // b. Calculate stats (Total, Average, Percentage)
        double[][] stats = calculateStats(pcmScores);

        // c. Calculate grades
        String[][] grades = calculateGrades(stats);

        // d. Display the scorecard
        displayScorecard(pcmScores, stats, grades);
    }

    // Method to generate random 2-digit scores (10-99)
    public static int[][] generateRandomScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(90) + 10; // Random number between 10 and 99
            }
        }
        return scores;
    }

    // Method to calculate Total, Average, and Percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to calculate Grade based on percentage
    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2]; // Percentage is at index 2
            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    // Method to display results in a tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPerc%\tGrade");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t");
            System.out.println(grades[i][0]);
        }
    }
}