package com.encapsulation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
	
	public Book(String id, String title, String author) {
		super(id, title, author);
	}
	
	@Override
	public int getLoanDuration() {
		return 21;
	}
	
	@Override
	public void reserveItem(String memberId) {
		System.out.println("Book "+getTitle()+" reserved for "+ memberId);
	}
	
	@Override
	public boolean checkAvailability() {
		return !isLoaned;
	}
}
