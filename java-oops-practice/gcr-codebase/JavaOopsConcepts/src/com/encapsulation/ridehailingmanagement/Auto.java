package com.encapsulation.ridehailingmanagement;

public class Auto extends Vehicle{
	private double waitingChargePerMin = 2.0;

    public Auto(String id, String driver) {
        super(id, driver, 8.0); 
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}
