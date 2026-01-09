package com.day5.parkease;

public class ParkingSlot {
	protected String slotId;
	protected boolean isOccupied;
	protected String vehicleTypeAllowed;
	
	public ParkingSlot(String slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		isOccupied = false; 
		this.vehicleTypeAllowed = vehicleTypeAllowed;
	}
	
	public boolean isAvailable() {
        return !isOccupied;
    }

    public void occupySlot() {
        this.isOccupied = true;
    }

    public void freeSlot() {
        this.isOccupied = false;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}
