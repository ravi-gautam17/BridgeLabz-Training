
import java.util.Scanner;

public class GeometryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take inputs for 2 points
        System.out.println("Enter coordinates for Point 1 (x1 y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x2 y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // 2. Calculate Distance
        double distance = findDistance(x1, y1, x2, y2);

        // 3. Calculate Line Equation (Slope and Y-intercept)
        double[] lineParams = findLineEquation(x1, y1, x2, y2);
        double m = lineParams[0];
        double b = lineParams[1];

        // 4. Display Results
        System.out.println("\n--- Geometry Results ---");
        System.out.println("Euclidean Distance: " + distance);
        
        if (Double.isInfinite(m)) {
            System.out.println("Equation: x = " + x1 + " (Vertical Line)");
        } else {
            System.out.println("Slope (m): " + m);
            System.out.println("Y-intercept (b): " + b);
            System.out.println("Equation of the line: y = " + m + " * x + " + b);
        }

        sc.close();
    }

    // Method to find the Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        // Formula: sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of a line (slope and y-intercept)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Compute the slope: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);

        // Compute the y-intercept: b = y1 - m * x1
        double b = y1 - m * x1;

        // Return an array having slope m and y-intercept b
        return new double[]{m, b};
    }
}
