package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
	
	public Staff(String name, int age) {
		super(name, age);
	}
	
	public void displayRole() {
		super.details();
		System.out.println("Role: Staff");
	}
}
