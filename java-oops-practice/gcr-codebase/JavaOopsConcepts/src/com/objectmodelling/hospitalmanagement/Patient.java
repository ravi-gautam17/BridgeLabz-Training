package com.objectmodelling.hospitalmanagement;

import java.util.ArrayList;

public class Patient {
    private int patientId;
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public String getName() {
        return name;
    }

    public int getPatientId() {
        return patientId;
    }
}
