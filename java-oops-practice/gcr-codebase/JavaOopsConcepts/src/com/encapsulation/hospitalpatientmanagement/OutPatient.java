package com.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient{
	private double consultationFee;
    private double diagnosticTestFee;

    public OutPatient(String id, String name, int age, double consultation, double tests) {
        super(id, name, age);
        this.consultationFee = consultation;
        this.diagnosticTestFee = tests;
    }

    @Override
    public double calculateBill() {
        return consultationFee + diagnosticTestFee;
    }
}
