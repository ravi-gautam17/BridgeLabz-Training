package com.day3.campusconnect;

public class Management implements ICourseActions{
	private String manageId;
	
	public Management(String manageId) {
		this.manageId = manageId;
	}
	
	@Override
	public void enrollCourse(Student student, Course course) {
		course.addStudent(student);
	}
	
	@Override
	public void dropCourse(Student student, Course course) {
		course.dropStudent(student);
	}
}
