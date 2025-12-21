import java.util.Scanner;

public class CollinearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Hint a: Take inputs for 3 points
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        double x1 = sc.nextDouble(),y1 = sc.nextDouble();
        double x2 = sc.nextDouble(),y2 = sc.nextDouble();
        double x3 = sc.nextDouble(),y3 = sc.nextDouble();

        checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        checkCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        sc.close();
    }

    // Hint b: Method using slope formula
    public static void checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        if (slopeAB == slopeBC && slopeBC == slopeAC) {
            System.out.println("By Slope: Points are Collinear");
        } else {
            System.out.println("By Slope: Points are NOT Collinear");
        }
    }

    // Hint c: Method using Area of Triangle formula
    public static void checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Formula: area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        if (Math.abs(area) == 0) {
            System.out.println("By Area: Points are Collinear (Area = 0)");
        } else {
            System.out.println("By Area: Points are NOT Collinear (Area = " + area + ")");
        }
    }
}