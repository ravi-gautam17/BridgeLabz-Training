package methodreferences.hospitalidprinting;

class Patient {
    int patientId;
    String name;

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }
}
