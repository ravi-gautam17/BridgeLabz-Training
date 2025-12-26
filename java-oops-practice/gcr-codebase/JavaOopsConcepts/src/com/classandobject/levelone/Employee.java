package com.classandobject.levelone;


class Employee {
	//non-static variables
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee(String name, int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//creating method to display employee details
	public  void displayEmployee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);
	}

}
