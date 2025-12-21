import java.util.Scanner;

public class CalendarGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input month and year
        System.out.print("Enter month (1-12) and year (e.g., 07 2005): ");
        int m = sc.nextInt();
        int y = sc.nextInt();

        // 1. Get Month Name and Days in Month
        String monthName = getMonthName(m);
        int totalDays = getDaysInMonth(m, y);
        
        // 2. Get the first day of the month (0=Sun, 1=Mon, ..., 6=Sat)
        int startDay = getFirstDay(m, 1, y);

        // Display Header
        System.out.println("\n" + monthName + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // 3. First for loop: Indentation for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("    "); // 4 spaces to align with Sun-Sat headers
        }

        // 4. Second for loop: Display days of the month
        for (int day = 1; day <= totalDays; day++) {
            // %3d right-justifies the number in a field of width 3
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            // (startDay + day) % 7 == 0 means the current day is a Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Final newline
        sc.close();
    }

    // Hint a: Method to get the name of the month
    public static String getMonthName(int m) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[m];
    }

    // Hint b: Method to get number of days (with Leap Year check)
    public static int getDaysInMonth(int m, int y) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m];
    }

    public static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Hint c: Gregorian calendar algorithm
    public static int getFirstDay(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
}