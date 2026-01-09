package com.day5.bookbaazar;

public class PrintedBook extends Book{
	
	public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price, int quantity) {
        double discount = price * quantity * 0.05; // 5% discount
        return (price * quantity) - discount;
    }
}
