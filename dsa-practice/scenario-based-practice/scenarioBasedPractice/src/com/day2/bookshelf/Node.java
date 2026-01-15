package com.day2.bookshelf;

public class Node {
	public String title;
	public String author;
	public String isbn;
	public Node next;
	
	public Node(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.next = null;
	}
}
