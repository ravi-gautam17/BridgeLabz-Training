package com.inheritance.animal;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}
