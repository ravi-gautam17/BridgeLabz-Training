package com.day4.PetPal;

public class Bird extends Pet{
	
	public Bird(String name, int age) {
		super(name, age);
		this.type = "Bird";
	}
	
	@Override
	public void makeSound() {
		System.out.println(super.getName() + ", Chirk Chirk.....");
	}
}
