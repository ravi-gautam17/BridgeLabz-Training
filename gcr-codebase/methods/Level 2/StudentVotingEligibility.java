import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            // Negative age is invalid
            return false;
        } else if (age >= 18) {
            // Age 18 or above can vote
            return true;
        } else {
            // Age below 18 cannot vote
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVotingEligibility checker = new StudentVotingEligibility();

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Check if the student can vote
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}
