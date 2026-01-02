package com.inheritance.vehicleTransportSystem;

public class Motorcycle extends Vehicle{
	private int seatCapacity;
	
	public Motorcycle(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Motorcycle Details: ---");
		super.displayInfo();
		System.out.println("Seat capacity: " + seatCapacity);
	}
}
