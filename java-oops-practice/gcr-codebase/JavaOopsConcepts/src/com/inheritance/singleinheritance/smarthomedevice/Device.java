package com.bridgelabz.oops.inheritance.singleinheritance.smarthomedevice;

public class Device {
	
	private int deviceId;
	private String status;   // (Active / Inactive ) // (On // Off) 
	
	public Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	public void displayStatus() {
		System.out.println("Status: " + status);
	}
}
