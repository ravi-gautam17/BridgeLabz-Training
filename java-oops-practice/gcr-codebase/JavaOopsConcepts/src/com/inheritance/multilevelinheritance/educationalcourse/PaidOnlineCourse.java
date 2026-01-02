package com.inheritance.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse{
	
	private long fee;
	private long discount;
	
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, long fee, long discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	public void displayCourse() {
		super.displayCourse();
		System.out.println("Fee: " + fee);
		System.out.println("Discount: " + discount);
	}
}
