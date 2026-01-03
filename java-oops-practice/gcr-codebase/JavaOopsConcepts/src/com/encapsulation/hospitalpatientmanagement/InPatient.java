package com.encapsulation.hospitalpatientmanagement;

public class InPatient extends Patient{
	private int daysStayed;
    private double dailyRate = 1200.0;
    private double pharmacyCharges;

    public InPatient(String id, String name, int age, int days, double pharmacy) {
        super(id, name, age);
        this.daysStayed = days;
        this.pharmacyCharges = pharmacy;
    }

    @Override
    public double calculateBill() {
        // Operators: (Rate * Days) + extra charges
        return (dailyRate * daysStayed) + pharmacyCharges;
    }
}
