import java.util.Scanner;

public class StudentsGrade2D {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create 2D array to store marks of the subjects
        double[][] marks=new double[numStudents][3];
       
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Take input for marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering marks for Student " + (i + 1) + ":");
            
            System.out.print("  Physics: ");
            double p = input.nextDouble();
            System.out.print("  Chemistry: ");
            double c = input.nextDouble();
            System.out.print("  Maths: ");
            double m = input.nextDouble();

            // Check for negative values
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("  Error: Negative marks detected. Re-entering for this student...");
                i--; // Decrement the index 
                continue; 
            }

            // Assign values to arrays at index i
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            // Calculate percentage and grade
            percentages[i] = (p + c + m) / 3.0;

            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70)
            {
                 grades[i] = 'B';
            }
            else if (percentages[i] >= 60) {
                grades[i] = 'C';
            }
            else if (percentages[i] >= 50){
                grades[i] = 'D';
            } 
        
            else if (percentages[i] >= 40){
                 grades[i] = 'E';
            }
            else {
                grades[i] = 'R';
            }
        }

        //Display the results
System.out.println("\n--- Student Results ---");

for (int i = 0; i < numStudents; i++) {
    System.out.println("Student " + (i + 1) + ":");
    System.out.println("  Marks: Physics=" + marks[i][0] + 
                       ", Chemistry=" +marks[i][1]+ 
                       ", Maths=" +marks[i][2]);
    System.out.println("  Percentage: " + percentages[i] + "%");
    System.out.println("  Grade: " + grades[i]);
    System.out.println("-----------------------");
}

        input.close();
    }
}

