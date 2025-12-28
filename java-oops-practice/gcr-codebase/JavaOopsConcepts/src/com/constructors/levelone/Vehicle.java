package com.constructors.levelone;

class Vehicle {

    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable (common for all vehicles)
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : " + registrationFee);
        System.out.println("-------------------------------");
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
