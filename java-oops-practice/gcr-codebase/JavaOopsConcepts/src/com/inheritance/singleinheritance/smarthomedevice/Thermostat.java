package com.inheritance.singleinheritance.smarthomedevice;

public class Thermostat extends Device{
	
	private int temperatureSetting; // in celcius (like 24 degree C)
	
	public Thermostat(int deviceId, String status, int temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	@Override
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temprature: " + temperatureSetting);
	}
}
