package java8workshop.smartcitysystem;

class AmbulanceService implements TransportService, EmergencyService {
    public String getName() { return "City Medics"; }
    public String getType() { return "Ambulance"; }
    public double getBaseFare() { return 0.0; } // Emergency is free
    public double getDistance() { return 10.5; }
}
