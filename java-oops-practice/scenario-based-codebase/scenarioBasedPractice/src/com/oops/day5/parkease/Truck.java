package com.day5.parkease;

public class Truck extends Vehicle implements IPayable{
	private final double baseRate = 40;
    private final double penalty = 100;
	
	public Truck(String vehicleNumber) {
		super(vehicleNumber);
		this.vehicleType = "Truck";
	}
	
	 @Override
	 public double calculateCharges(int hours) {
		 if (hours > 3) {
			 return (baseRate * hours) + penalty;
		 }
		 return baseRate * hours;
	 }
}
