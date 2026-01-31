package functionalinterfaces.smartvehicledashboard;

public class SmartDashboard {

    public static void main(String[] args) {

        Vehicle petrolCar = new PetrolCar();
        Vehicle electricCar = new ElectricCar();

        petrolCar.displaySpeed();
        petrolCar.displayBatteryPercentage();

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
