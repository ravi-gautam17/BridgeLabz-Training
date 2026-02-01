package streamapi.iotsensorreading;

import java.util.*;

public class IoTSensorApp {
    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
            28.5,
            35.2,
            31.8,
            22.4,
            40.1
        );

        double threshold = 30.0;
        sensorReadings.stream()
        .filter(reading -> reading > threshold) // 1️⃣ filter above threshold
        .forEach(reading ->
                System.out.println("Alert! High reading: " + reading)
        );
}
}
