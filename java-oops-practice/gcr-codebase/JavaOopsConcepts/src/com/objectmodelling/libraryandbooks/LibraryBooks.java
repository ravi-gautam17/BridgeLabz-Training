package com.objectmodelling.libraryandbooks;


public class LibraryBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Atomic Habits", "Thomas", "2462752");
		Book b2 = new Book("Doglapan", "Ashneer", "7827828");
		Book b3 = new Book("The Night Circus", "MorgenStren", "6728821");
		Library l1 = new Library("LCM Library");
		Library l2 = new Library("Kanha Library");
		Library l3 = new Library("Explore Library");
		
		// adding books
		l1.addBook(b1);
		l1.addBook(b2);
		l2.addBook(b3);
		
		// display books
	    l1.showBooks();
	    l2.showBooks();
	    l3.showBooks();
	}

}