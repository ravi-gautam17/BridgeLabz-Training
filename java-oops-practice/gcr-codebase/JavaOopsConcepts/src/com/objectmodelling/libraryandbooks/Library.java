package com.objectmodelling.libraryandbooks;
import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Book> books;
	
	Library(String name){
		this.name = name;
		this.books = new ArrayList<>();
	}
	
	public void showBooks() {
		if(books.isEmpty()) {
			System.out.println("Sorry, We Currently have no Books");
		}
		else {
			for(Book b: books) {
				b.displayBook();
			}
		}
	}
	
	public void addBook(Book b) {
		books.add(b);
	}

}