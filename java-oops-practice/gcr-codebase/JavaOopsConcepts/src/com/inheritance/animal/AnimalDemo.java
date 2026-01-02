package com.inheritance.animal;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound(); // dog barks
        a2.makeSound(); // cat meows
        a3.makeSound(); // bird chirps
	}

}
