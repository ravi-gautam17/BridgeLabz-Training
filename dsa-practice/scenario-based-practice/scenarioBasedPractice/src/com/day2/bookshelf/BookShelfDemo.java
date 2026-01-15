package com.day2.bookshelf;

public class BookShelfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("LCM Library");

        library.addBook("Fiction", "Atomic Habits", "James Ronaldo", "BK909");
        library.addBook("Fiction", "Business Times", "Paul pogba", "BK111");
        library.addBook("Biography", "Wings of Fire", "A.P.J Abdul Kalam", "KD239");

        library.showBooksByGenre("Fiction");
        library.showBooksByGenre("Biography");

        library.deleteBook("Fiction", "Atomic Habits");

        library.showBooksByGenre("Fiction");
		
	}

}
