package com.classandobject.levelone;

public class HandleBook {
	String bookTitle;
	String bookAuthor;
	double price;
	
	HandleBook(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
	HandleBook book1= new HandleBook("2States", "Chetan Bhagat", 500);
	HandleBook book2=new HandleBook("Wings Of Fire","Abdul kalam.A.P.J",  500);
	book1.displayBookDetails();
	book2.displayBookDetails();
	}
}
