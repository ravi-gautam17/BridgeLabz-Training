package com.encapsulation.employeemanagement;


public class PartTimeEmployee extends Employee{
	private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int hours, double rate) {
        super(id, name, 0); 
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }
    
  

	@Override
    public double calculateSalary() {
    	return hoursWorked* hourlyRate;
    }
}