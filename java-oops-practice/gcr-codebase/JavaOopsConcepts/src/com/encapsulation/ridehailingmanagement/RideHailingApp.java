
package com.encapsulation.ridehailingmanagement;

public class RideHailingApp {
	
	public static void printFareEstimate(Vehicle v, double distance) {
        System.out.println(v.getVehicleDetails());
        System.out.println("Driver " + v.getDriverName() + " is currently at: " + v.getCurrentLocation());
        System.out.println("Estimated Fare for " + distance + "km: $" + v.calculateFare(distance));
        System.out.println("------------------------------------\n");
    }

    public static void main(String[] args) {
        Vehicle myRide = new Car("CAR-77", "Alex");
        Vehicle ecoRide = new Bike("BKE-12", "Sam");
        Vehicle budgetRide = new Auto("AUTO-09", "Raj");

        myRide.updateLocation("Downtown");
        ecoRide.updateLocation("Central Station");
        budgetRide.updateLocation("Airport Terminal");

        System.out.println("--- Available Rides ---");
        
        printFareEstimate(myRide, 10.5);
        printFareEstimate(ecoRide, 10.5);
        printFareEstimate(budgetRide, 10.5);
    }
}
