package java8workshop.smartcitysystem;

// Concrete Implementations
class BusService implements TransportService {
 private String name;
 private double baseFare, distance;
 public BusService(String name, double baseFare, double distance) { 
     this.name = name; this.baseFare = baseFare; this.distance = distance; 
 }
 public String getName() { return name; }
 public String getType() { return "Bus"; }
 public double getBaseFare() { return baseFare; }
 public double getDistance() { return distance; }
}
