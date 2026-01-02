package com.encapsulation.ridehailingmanagement;

public abstract class Vehicle implements GPS {

	private String vehicleId;
    private String driverName;
    private String currentLocation;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + " | Driver: " + driverName;
    }

    public abstract double calculateFare(double distance);

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getDriverName() { 
    	return driverName; 
    }

}
