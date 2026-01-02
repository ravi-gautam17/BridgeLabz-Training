package com.inheritance.employeeManagement;

public class Intern extends Employee{
	
	public Intern(String name, int id, double salary) {
		super(name, id, salary);
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Employee Details:--- Intern");
		super.displayDetails();
	}
}
