package com.inheritance.vehicleTransportSystem;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Car(240, "Cng", 4);
		Vehicle v2 = new Truck(180, "Deisel");
		Vehicle v3 = new Car(140, "Petrol", 2);
		
		v1.displayInfo();
		System.out.println();
		
		v2.displayInfo();
		System.out.println();
		
		v3.displayInfo();
	}

}
