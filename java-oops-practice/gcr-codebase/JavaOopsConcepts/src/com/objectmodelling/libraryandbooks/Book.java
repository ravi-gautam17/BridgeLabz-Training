package com.objectmodelling.libraryandbooks;


public class Book {

	private String title;
	private String author;
	private String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public void displayBook() {
		System.out.println("Title: " + (title) + ", Author: " + (author) + ", ISBN: " + (isbn));
	}
}