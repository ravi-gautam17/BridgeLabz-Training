package com.day5.parkease;

public class Bike extends Vehicle implements IPayable{
	private final double baseRate = 15;
    private final double penalty = 20;
	
	public Bike(String vehicleNumber) {
		super(vehicleNumber);
		this.vehicleType = "Bike";
	}
	
	 @Override
	 public double calculateCharges(int hours) {
		 if (hours > 4) {
			 return (baseRate * hours) + penalty;
		 }
		 return baseRate * hours;
	 }	
	
}
