package java8workshop.smartcitysystem;

import java.util.*;
import java.util.stream.Collectors;

// The Management System
public class SmartCitySystem {
 public static void main(String[] args) {
     // Mock Data: Active trips in the city
     List<TransportService> activeServices = Arrays.asList(
         new BusService("Route A1", 2.50, 12.0),
         new BusService("Route B2", 3.00, 5.5),
         new AmbulanceService(),
         new BusService("Express 9", 5.00, 20.0)
     );

     // A. Lambda Expressions: Filter & Sort
     // Find services under $4.00, sorted by distance
     System.out.println("--- Affordable Services (Sorted by Distance) ---");
     activeServices.stream()
         .filter(s -> s.getBaseFare() < 4.00)
         .sorted(Comparator.comparing(TransportService::getDistance))
         .forEach(TransportService::printServiceDetails); // Method Reference

     // B. Functional Interface & Lambda: Dynamic Fare Calculation
     FareCalculator peakHourSurcharge = (base, dist) -> base + (dist * 0.5);
     double sampleFare = peakHourSurcharge.calculate(10.0, 5.0);
     System.out.println("\nPeak Hour Fare Calculation: $" + sampleFare);

     // C. Stream APIs & Collectors: Grouping & Summaries
     // Group services by their Type
     Map<String, List<TransportService>> groupedByType = activeServices.stream()
         .collect(Collectors.groupingBy(TransportService::getType));

     // Partition: Peak vs Non-Peak (Logic: Distance > 10km is Peak for this example)
     Map<Boolean, List<TransportService>> longDistanceTrips = activeServices.stream()
         .collect(Collectors.partitioningBy(s -> s.getDistance() > 10.0));

     // Summarizing Fares
     DoubleSummaryStatistics fareStats = activeServices.stream()
         .collect(Collectors.summarizingDouble(TransportService::getBaseFare));

     System.out.println("\n--- Dashboard Statistics ---");
     System.out.println("Total Services: " + fareStats.getCount());
     System.out.println("Average Base Fare: $" + fareStats.getAverage());

     // D. Marker Interface Check
     System.out.println("\n--- Traffic Priority Check ---");
     activeServices.forEach(s -> {
         if (s instanceof EmergencyService) {
             System.out.println("PRIORITY: " + s.getName() + " is bypassing traffic.");
         }
     });
 }
}
