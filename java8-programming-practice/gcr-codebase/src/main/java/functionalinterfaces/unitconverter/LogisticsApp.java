package functionalinterfaces.unitconverter;

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        double distanceMiles = UnitConverter.kmToMiles(distanceKm);
        double weightPounds = UnitConverter.kgToPounds(weightKg);

        System.out.println("Distance in miles: " + distanceMiles);
        System.out.println("Weight in pounds: " + weightPounds);
    }
}

