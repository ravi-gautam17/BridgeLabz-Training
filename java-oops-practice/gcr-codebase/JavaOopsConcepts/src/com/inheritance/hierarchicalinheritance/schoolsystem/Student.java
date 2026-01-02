package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person{

	private char grade;
	
	public Student(String name, int age, char grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public void displayRole() {
		super.details();
		System.out.println("Role: Student");
		System.out.println("Grade: " + grade);
	}
}
