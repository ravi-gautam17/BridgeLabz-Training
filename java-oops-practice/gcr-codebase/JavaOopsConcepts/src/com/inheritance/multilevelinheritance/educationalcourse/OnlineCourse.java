package com.inheritance.multilevelinheritance.educationalcourse;

public class OnlineCourse extends Course{
	
	private String platform;
	private boolean isRecorded;
	
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	public void displayCourse() {
		super.displayCourse();
		System.out.println("Platform Name: " + platform);
		System.out.println("Recorded: " + (isRecorded == true ? "Yes" : "NO"));
	}
}
