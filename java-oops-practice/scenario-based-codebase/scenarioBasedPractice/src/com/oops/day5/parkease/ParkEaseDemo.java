package com.day5.parkease;


public class ParkEaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ParkingSlot carSlot = new ParkingSlot("C101", "Car");
		 ParkingSlot bikeSlot = new ParkingSlot("B201", "Bike");

		 Parking parking = new Parking();
		 parking.addParkingSlot(carSlot);
		 parking.addParkingSlot(bikeSlot);

		 Vehicle car = new Car("MP09-1234");
		 Vehicle bike = new Bike("MP09-5678");

		 parking.parkVehicle(car);
		 parking.parkVehicle(bike);

		 IPayable payableCar = (IPayable) car;
		 System.out.println("Car Charges: ₹" + payableCar.calculateCharges(6));

		 // displaying logs
		 parking.showLogs();	 
	}

}
