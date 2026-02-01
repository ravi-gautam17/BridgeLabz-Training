package java8workshop.smartcitysystem;

//Interface with Default and Static Methods
interface TransportService {
 String getName();
 String getType();
 double getBaseFare();
 double getDistance();

 // Default method: Shared logic for all transport types
 default void printServiceDetails() {
     System.out.println("[" + getType() + "] Service: " + getName() + " | Base Fare: $" + getBaseFare());
 }

 // Static method: Utility logic for geographic calculations
 static double calculateDistance(double x1, double y1, double x2, double y2) {
     return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 }
}
