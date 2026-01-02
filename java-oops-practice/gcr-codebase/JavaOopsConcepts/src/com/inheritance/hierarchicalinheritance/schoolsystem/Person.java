package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void details() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
