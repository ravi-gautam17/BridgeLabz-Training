package com.objectmodelling.hospitalmanagement;


import java.util.ArrayList;

public class Doctor {
    private int doctorId;
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Consultation:");
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public String getName() {
        return name;
    }
}
