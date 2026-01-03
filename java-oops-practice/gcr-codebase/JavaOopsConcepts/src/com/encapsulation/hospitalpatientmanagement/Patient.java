package com.encapsulation.hospitalpatientmanagement;
import java.util.*;

public abstract class Patient implements MedicalRecord{
	private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory; // Encapsulated: Private data

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }
    
    public String getPatientDetails() {
        return "ID: " + patientId + " | Name: " + name + " | Age: " + age;
    }
    
    public abstract double calculateBill();
    
    @Override
    public void addRecord(String entry) {
        medicalHistory.add(entry);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + name + ": " + medicalHistory);
    }
    
    public String getName() { 
    	return name;
    }
}
