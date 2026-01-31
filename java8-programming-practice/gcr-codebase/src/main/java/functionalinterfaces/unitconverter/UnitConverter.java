package functionalinterfaces.unitconverter;

public interface UnitConverter {

    // Convert kilometres to miles
    static double kmToMiles(double kilometres) {
        return kilometres * 0.621371;
    }

    // Convert kilograms to pounds
    static double kgToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
}

