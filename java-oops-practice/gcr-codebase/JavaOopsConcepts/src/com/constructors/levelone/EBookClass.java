package com.constructors.levelone;

public class EBookClass extends BookClass {
	 double fileSize; // in MB

	    // Constructor
	    EBookClass(String ISBN, String title, String author, double fileSize) {
	        super(ISBN, title, author);
	        this.fileSize = fileSize;
	    }

	    // Method demonstrating access modifiers
	    void displayEBookDetails() {
	        System.out.println("ISBN       : " + ISBN);      // public
	        System.out.println("Title      : " + title);     // protected
	        System.out.println("Author     : " + getAuthor()); // private via getter
	        System.out.println("File Size  : " + fileSize + " MB");
	    }
}
