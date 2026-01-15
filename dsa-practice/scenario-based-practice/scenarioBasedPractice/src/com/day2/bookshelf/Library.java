package com.day2.bookshelf;
import java.util.HashMap;

public class Library {
	private String name;
	HashMap<String, LinkedList> books;
	
	public Library(String name) {
		this.name = name;
		books = new HashMap<>();
	}
	
	public void addBook(String genre, String title, String author, String isbn) {
		if(!books.containsKey(genre)) {
			books.put(genre, new LinkedList());
		}
		
		books.get(genre).insertFromEnd(title, author, isbn);
	}
	
	public void deleteBook(String genre, String title) {
		LinkedList list = books.get(genre);
		
		if(list == null) {
			System.out.println("Genre Not Found.....");
			return;
		}
		
		list.deleteBook(title);
	}
	
	public void showBooksByGenre(String genre) {
        LinkedList list = books.get(genre);

        if (list == null) {
            System.out.println("No books found for genre: " + genre);
            return;
        }

        System.out.print("Books in " + genre + ": ");
        list.displayList();
    }
}
