package com.day3.campusconnect;
import java.util.*;

public class Course {
	private String courseId;
	private String name;
	protected List<Student> students;
	private Faculty faculty; // assigned faculty
	
	public Course(String name, String courseId) {
		this.name = name;
		this.courseId = courseId;
		students = new ArrayList<>();
	}
	
	protected void addStudent(Student student) {
		System.out.println("Student Added....");
		students.add(student);
	}
	
	protected void dropStudent(Student student) {
		System.out.println("Student Drop.....");
		students.remove(student);
	}
	
	public void assignFaculty(Faculty faculty) {
		this.faculty = faculty;
		System.out.println("Faculty Assigned.....");
	}
	
	public void showStudents() {
		if(students.isEmpty()) {
			System.out.println("Currently " + name +  " course have zero enrolled Student");
		}
		else {
			System.out.println("Enrolled Student in Course: " + name);
			for(Student student: students) {
				System.out.print(student.name + ", ");
			}
			System.out.println();
		}
	}
}
