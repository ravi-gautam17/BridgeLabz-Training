package com.inheritance.employeeManagement;

public class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(String name, int id, double salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage; 
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Employee Details:--- Developer");
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}
