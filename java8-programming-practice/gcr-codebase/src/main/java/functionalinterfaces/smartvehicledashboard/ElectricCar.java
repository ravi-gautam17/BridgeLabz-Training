package functionalinterfaces.smartvehicledashboard;

public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car Speed: 90 km/h");
    }

    // Overriding default method
    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Level: 65%");
    }
}
