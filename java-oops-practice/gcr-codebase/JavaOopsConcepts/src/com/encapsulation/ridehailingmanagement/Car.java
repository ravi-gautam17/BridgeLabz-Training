package com.encapsulation.ridehailingmanagement;

public class Car extends Vehicle{
	private double baseBookingFee = 30.0;

    public Car(String id, String driver) {
        super(id, driver, 15.0); 
    }

    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) + baseBookingFee;
    }
}
