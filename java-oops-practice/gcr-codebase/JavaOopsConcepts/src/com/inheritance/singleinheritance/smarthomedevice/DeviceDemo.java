package com.inheritance.singleinheritance.smarthomedevice;

public class DeviceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Device d1 = new Thermostat(101, "Active", 24);
		Device d2 = new Thermostat(204, "InActive", 16);
		
		d1.displayStatus();
		System.out.println();
		
		d2.displayStatus();
	}

}
