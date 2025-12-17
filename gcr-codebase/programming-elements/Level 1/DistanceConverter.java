import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {

        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Read distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

       
        double distanceInYards = distanceInFeet / 3;

        double distanceInMiles = distanceInYards / 1760;

        // Print the result
        System.out.println(
            "Distance in yards is " + distanceInYards +
            " and distance in miles is " + distanceInMiles
        );

        // Close scanner
        scanner.close();
    }
}
