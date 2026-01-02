package com.inheritance.singleinheritance.librarymanagement;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Author("Atomic Habit", 2017, "David John", "Habits Change you");
		b1.displayInfo();
		System.out.println();
		
		Book b2 = new Author("Businees Days", 2009, "Marcus", "All about business");
		b2.displayInfo();
		
	}

}
