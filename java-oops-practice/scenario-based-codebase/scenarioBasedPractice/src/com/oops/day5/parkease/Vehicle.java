package com.day5.parkease;

public class Vehicle {
	private String vehicleNumber;
	protected String vehicleType;
	
	Vehicle(String vehicleNumber){
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
