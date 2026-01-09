package com.day5.parkease;

public class Car extends Vehicle implements IPayable{
	private final double baseRate = 25;
	private final double penalty = 50;
	
	public Car(String vehicleNumber) {
		super(vehicleNumber);
		this.vehicleType = "Car";
	}
	
	@Override
    public double calculateCharges(int hours) {
        if (hours > 5) {
            return (baseRate * hours) + penalty;
        }
        return baseRate * hours;
    }
}
