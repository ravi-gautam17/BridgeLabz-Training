package com.day1.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Library {
     HashMap<String, LinkedList<Book>> catalog=new HashMap<>();
     HashSet<Integer> bookIds=new HashSet<>();
     
     public void addBook(String genre,Book book) {
    	 if(bookIds.contains(book.id)) {
    		 System.out.println("Book already exists");
    		 return;
    	 }
    	 
        catalog.putIfAbsent(genre, new LinkedList<Book>());
        catalog.get(genre).add(book);
        bookIds.add(book.id);
    	 
     }
     public void borrowBook(String genre, Book book) {
    	 if(!catalog.containsKey(genre)) {
    		 System.out.println("Genre does not exists");
             return;
    	 }
    	 LinkedList<Book> Books=catalog.get(genre);
    	 for(Book b:Books) {
    		 if(b.id==book.id) {
    			 Books.remove(b);
    			 bookIds.remove(book.id);
    			 System.out.println("Book borrowed");
    			 return;
    		 }
    	 }
    	 System.out.println("Book not found "); 	 	 
     }
     public void displayBook() {
    	 for(String genre: catalog.keySet()) {
    		 System.out.println("Genre : "+genre);
    		 LinkedList<Book> books=catalog.get(genre);
    		 for(Book book:books) {
    			 System.out.println("Book : "+book.title+" and Book ID: "+book.id);
    		 }
    	 }
     }
     
}
