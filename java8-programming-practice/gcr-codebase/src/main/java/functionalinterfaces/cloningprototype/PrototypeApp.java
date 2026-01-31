package functionalinterfaces.cloningprototype;

public class PrototypeApp {

    public static void main(String[] args) {

        try {
            // Original prototype object
            VehiclePrototype original =
                    new VehiclePrototype("Electric SUV", 180);

            // Cloned object
            VehiclePrototype cloned =
                    (VehiclePrototype) original.clone();

            original.displayDetails();
            cloned.displayDetails();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
