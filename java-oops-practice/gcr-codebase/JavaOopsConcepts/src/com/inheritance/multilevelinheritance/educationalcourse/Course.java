package com.inheritance.multilevelinheritance.educationalcourse;

public class Course {
	
	private String courseName;
	private int duration;   // duration in month
	
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public void displayCourse() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Duration: " + duration);
	}
}
