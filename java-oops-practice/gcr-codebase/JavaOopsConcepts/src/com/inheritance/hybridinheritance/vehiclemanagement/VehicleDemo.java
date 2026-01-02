package com.inheritance.hybridinheritance.vehiclemanagement;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ElectricVehicle ev = new ElectricVehicle(245, "Range Rover");
	        System.out.println("Electric Vehicle Details:");
	        ev.displayInfo();
	        ev.charge();

	        System.out.println();

	        PetrolVehicle pv = new PetrolVehicle(220, "Fortuner");
	        System.out.println("Petrol Vehicle Details:");
	        pv.displayInfo();
	        pv.refuel();
	}

}
