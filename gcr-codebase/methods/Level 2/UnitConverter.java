//Program to convert from one unit to another unit and convert 

import java.util.Scanner;

public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }
	
	// Method To convert miles to kilometers and return the value
	 public static double convertMilesToKM(double miles) {
        // Convert miles to kilometer
        double miles2km = 1.60934;
        double kmetres=  miles*miles2km;

        // return the value
        return kmetres;
    }
	
	 // Method To convert meters to feet and return the value
	 public static double convertMetersToFeet(double meters) {
        // Convert meters to feet
        double meters2feet = 3.28084;
        double feet= meters*meters2feet;

        // return the value
        return feet;
    }
	// Method To convert feet to meters and return the value
	 public static double convertFeetToMeters(double feet) {
        // Convert feet to meters
        double feet2meters = 0.3048;
        double meters=feet*feet2meters;

        // return the value
        return meters;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Call the method to convert km to miles
        double miles = convertKmToMiles(km); 

        // Display value in miles
        System.out.println("Distance in miles: " + miles);

         // Take input for miles
        System.out.print("Enter the distance in miles: ");
        double mil= sc.nextDouble();
		
        // Call the method to convert miles to km	
        double kmetres = convertMilesToKM(mil); 

        // Display value in kilometers
        System.out.println("Distance in km: " + kmetres);
		
		// Take input for meters
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
		 // Call the method to convert meters to feet
        double feet = convertMetersToFeet(meters); 

        // Display value in kilometers
        System.out.println("Distance in feet: " + feet);
		
		// Take input for feet
        System.out.print("Enter the distance in feet: ");
        double feets = sc.nextDouble();
		 // Call the method to convert meters to feet
        double metr = convertFeetToMeters(feets); 

        // Display value in meters
        System.out.println("Distance in meters: " + metr);

        // Close the Scanner object
        sc.close();
    }
}
