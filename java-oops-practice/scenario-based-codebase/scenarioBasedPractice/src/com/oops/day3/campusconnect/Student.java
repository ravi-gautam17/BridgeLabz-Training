package com.day3.campusconnect;

public class Student extends Person{
	private String grade;
	
	public Student(String name, String email, String id){
		super(name, email, id);
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	String getGrade() {
		return grade;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student Details..................");
		System.out.println("Student ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Grade: " + ((grade != null) ? grade : "Not Assigned"));
	}
}
