package com.inheritance.hybridinheritance.restaurantmanagement;

public class Person {
	
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
}
