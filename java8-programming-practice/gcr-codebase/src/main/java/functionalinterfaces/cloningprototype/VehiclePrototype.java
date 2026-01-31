package functionalinterfaces.cloningprototype;

public class VehiclePrototype implements Cloneable {

    private String model;
    private int maxSpeed;

    public VehiclePrototype(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed);
    }
}

