package com.day5.parkease;
import java.util.*;

public class Parking {
	
	private List<ParkingSlot> slots;
	private List<String> bookingLogs;
	
	public Parking() {
		this.slots = new ArrayList<>();
		this.bookingLogs = new ArrayList<>();
	}
	
	public void addParkingSlot(ParkingSlot parkingslot) {
		slots.add(parkingslot);
	}
	
	public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable() &&
                slot.getVehicleTypeAllowed().equals(vehicle.getVehicleType())) {

                slot.occupySlot();
                String log = vehicle.getVehicleType() +
                        " (" + vehicle.getVehicleNumber() + ") parked at slot " +
                        slot.getSlotId();

                bookingLogs.add(log);
                System.out.println(log);
                return;
            }
        }
        System.out.println("No parking slot available for " + vehicle.getVehicleType());
    }
	
    public void showLogs() {
        System.out.println("\nParking Logs -------------");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }	
}
