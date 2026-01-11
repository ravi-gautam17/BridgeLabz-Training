package com.day1.bookshelf;

public class UseLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book b1=new Book(10,"atomic habits","james clear");
        Book b2=new Book(20,"sita ","amish tripathi");
        Book b3=new Book(30,"ram scion of ishvaku","clean  clear");
        Book b4=new Book(40,"hyperfocus","telusko");
        Book b5=new Book(50,"Jagsunasuna","ravi ravi");
        
        Library lib=new Library();
        lib.addBook("Mythology", b2);
        lib.addBook("Mythology", b3);
        
        lib.addBook("Self-help", b1);
        lib.addBook("Self-help", b4);
        
        lib.addBook("Romantic", b5);
        
        lib.displayBook();
        
        lib.borrowBook("Self-help", b4);
        
        lib.displayBook();
        
        
	}

}
