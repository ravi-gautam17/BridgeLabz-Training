package com.day4.smartshelf;

public class SmartShelfDemo {

	public static void insertionSort(Book books[]) {
		int n = books.length;
		
		for(int i=1; i<n; i++) {
			Book key = books[i];
			int j = i - 1;
			
			while(j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
				books[j + 1] = books[j];
				j--;
			}
			books[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book[] books = {new Book("Data Structures"), new Book("Algorithms"), new Book("Computer Networks"), new Book("Operating Systems")};

		 insertionSort(books);

		 System.out.println("📚 Sorted Reading List:");
		 for (Book b : books) {
			 System.out.println(b.title);
		 }
	}

}
