import java.util.Scanner;

public class QuadraticEquation{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficients for ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        // Display results based on the number of roots returned
        if (roots.length == 0) {
            System.out.println("The equation has no real roots (delta is negative).");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        sc.close();
    }

    /**
     * Method to find roots of a quadratic equation.
     * Returns an array of doubles:  
     */
    public static double[] findRoots(double a, double b, double c) {
        // Use Math.pow(b, 2) to get b squared
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } 
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } 
        else {
            // Delta is negative, return empty array
            return new double[0];
        }
    }
}