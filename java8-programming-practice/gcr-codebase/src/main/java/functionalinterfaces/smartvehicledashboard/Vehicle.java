package functionalinterfaces.smartvehicledashboard;

public interface Vehicle {

    // Common method for all vehicles
    void displaySpeed();

    // New feature added later (default method)
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available for this vehicle.");
    }
}
