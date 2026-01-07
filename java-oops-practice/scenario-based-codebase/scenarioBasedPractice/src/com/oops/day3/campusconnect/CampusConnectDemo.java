package com.day3.campusconnect;

public class CampusConnectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Ravi", "ravi54@gmail.com", "STU101");
		Student s2 = new Student("Ashish", "ahsish2@gmail.com", "STU103");
		
		Faculty f1 = new Faculty("Vedansh", "vedansh82@gmail.com", "FT802");
		
		Course c1 = new Course("Java", "CU707");
		c1.showStudents();
		
		Management m1 = new Management("M50505");
		//s1.printDetails();
		//s2.printDetails();
		f1.printDetails();
		
		m1.enrollCourse(s2, c1);
		m1.enrollCourse(s1, c1);
		c1.showStudents();
		
		f1.assignMarks(s1, 88);
		f1.assignMarks(s2, 75);
		c1.assignFaculty(f1);
		
		s1.printDetails();
		s2.printDetails();
		
	}

}
