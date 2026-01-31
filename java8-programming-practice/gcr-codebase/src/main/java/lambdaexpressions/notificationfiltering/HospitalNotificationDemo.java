package lambdaexpressions.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HospitalNotificationDemo {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("Heart rate abnormal", "CRITICAL", 5),
                new Alert("Medication reminder", "INFO", 2),
                new Alert("Blood pressure high", "WARNING", 4),
                new Alert("Appointment scheduled", "INFO", 1),
                new Alert("Oxygen level low", "CRITICAL", 5)
        );

        // 🔹 User preference: show only CRITICAL alerts
        Predicate<Alert> criticalOnly =
                alert -> alert.type.equals("CRITICAL");

        // 🔹 User preference: priority >= 4
        Predicate<Alert> highPriority =
                alert -> alert.priority >= 4;

        // 🔹 Combine preferences using AND
        Predicate<Alert> criticalAndHighPriority =
                criticalOnly.and(highPriority);

        List<Alert> filteredAlerts = alerts.stream()
                .filter(criticalAndHighPriority)
                .collect(Collectors.toList());

        System.out.println("Filtered Alerts:");
        filteredAlerts.forEach(System.out::println);
    }
}
