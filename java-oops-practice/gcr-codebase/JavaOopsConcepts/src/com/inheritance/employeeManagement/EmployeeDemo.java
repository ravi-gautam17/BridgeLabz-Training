package com.inheritance.employeeManagement;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Manager("Raj", 101, 30000, 5);
		Employee e2 = new Developer("Swaraj", 201, 25000, "Java");
		Employee e3 = new Intern("Ashish", 104, 12000);
		
		e1.displayDetails();
		System.out.println();
		
		e2.displayDetails();
		System.out.println();
		
		e3.displayDetails();
	}

}
