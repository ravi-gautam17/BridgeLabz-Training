package com.inheritance.vehicleTransportSystem;

public class Truck extends Vehicle{
	
	public Truck(int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Truck Details: ---");
		super.displayInfo();
	}
}
