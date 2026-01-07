package com.day3.campusconnect;

public class Faculty extends Person{
	
	public Faculty(String name, String email, String id) {
		super(name, email, id);
	}
	
	public void assignMarks(Student student, double marks) {
		if(marks >= 90)
			assignGrade(student, "A");
		else if(marks >= 80)
			assignGrade(student, "B");
		else if(marks >= 70)
			assignGrade(student, "C");
		else if(marks >= 50)
			assignGrade(student, "D");
		else 
			assignGrade(student, "F");
	}
	
	private void assignGrade(Student student, String grade) {
		student.setGrade(grade);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Faculty Details..................");
		System.out.println("Faculty ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}
}
