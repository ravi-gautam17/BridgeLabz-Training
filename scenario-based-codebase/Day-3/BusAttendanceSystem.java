import java.util.Scanner;

public class BusAttendanceSystem {
    public static void main(String[] args) {

        String[] students = {
            "Amit", "Ravi", "Neha", "Priya", "Rahul",
            "Anjali", "Suresh", "Kiran", "Pooja", "Vikas"
        };

        Scanner sc = new Scanner(System.in);
        int presentCount = 0;
        int absentCount = 0;

        // for-each loop to track attendance
        for (String name : students) {
            System.out.print("Is " + name + " Present or Absent? ");
            String status = sc.nextLine();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else if (status.equalsIgnoreCase("Absent")) {
                absentCount++;
            } else {
                System.out.println("Invalid input. Marked as Absent.");
                absentCount++;
            }
        }

        System.out.println("\n--- Attendance Summary ---");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);

        sc.close();
    }
}
