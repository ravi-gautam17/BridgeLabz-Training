package com.day5.bookbaazar;

public class BookBaazarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book ebook = new EBook("Java Mastery", "James Gosling", 500, 10);
        Book printedBook = new PrintedBook("Clean Code", "Robert C. Martin", 800, 5);

        Order order = new Order("Vedansh");

        order.addBook(ebook, 2);
        order.addBook(printedBook, 1);

        System.out.println("Total Bill: ₹" + order.calculateTotal());
        System.out.println("Order Status: " + order.getOrderStatus());
	}

}
