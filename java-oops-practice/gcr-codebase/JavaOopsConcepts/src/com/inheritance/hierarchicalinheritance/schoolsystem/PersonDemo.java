package com.inheritance.hierarchicalinheritance.schoolsystem;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher("Raj", 33, "Physics");
		t1.displayRole();
		System.out.println();
		
		Student s1 = new Student("Ashish", 17, 'C');
		s1.displayRole();
		System.out.println();
		
		Staff s2 = new Staff("Swaraj", 22);
		s2.displayRole();
	}

}
