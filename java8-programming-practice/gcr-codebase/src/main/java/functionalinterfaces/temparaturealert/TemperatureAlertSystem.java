package functionalinterfaces.temparaturealert;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double thresholdTemperature = 37.5;

        // Predicate to check if temperature crosses the threshold
        Predicate<Double> temperatureAlert = temp -> temp > thresholdTemperature;

        double currentTemperature = 38.2;

        // Applying the predicate
        if (temperatureAlert.test(currentTemperature)) {
            System.out.println(" Alert! Temperature crossed the safe limit.");
        } else {
            System.out.println("Temperature is within the safe range.");
        }
    }
}

