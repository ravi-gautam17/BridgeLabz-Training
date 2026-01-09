package com.day5.bookbaazar;

public class EBook extends Book{
	
	 public EBook(String title, String author, double price, int stock) {
	        super(title, author, price, stock);
	    }

	    @Override
	    public double applyDiscount(double price, int quantity) {
	        double discount = price * quantity * 0.10; // 10% discount
	        return (price * quantity) - discount;
	    }
}
