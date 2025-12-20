import java.util.*;
public class UnitConvertor2 {
    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        double centimeters = inches * inches2cm;
        return centimeters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Yards to Feet
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println("Distance in feet: " + feet);

        // Feet to Yards
        System.out.print("Enter distance in feet: ");
        double feets = sc.nextDouble();
        double yardsValue = convertFeetToYards(feets);
        System.out.println("Distance in yards: " + yardsValue);

        // Meters to Inches
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println("Distance in inches: " + inches);

        // Inches to Meters
        System.out.print("Enter distance in inches: ");
        double inchValue = sc.nextDouble();
        double meterValue = convertInchesToMeters(inchValue);
        System.out.println("Distance in meters: " + meterValue);

        // Inches to Centimeters
        System.out.print("Enter distance in inches: ");
        double inchCM = sc.nextDouble();
        double centimeters = convertInchesToCentimeters(inchCM);
        System.out.println("Distance in centimeters: " + centimeters);

        sc.close();
    }
}
