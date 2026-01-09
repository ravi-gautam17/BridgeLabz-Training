package com.day5.bookbaazar;

public abstract class Book implements IDiscountable{
	 protected String title;
	    protected String author;
	    protected double price;
	    private int stock;   

	    // Constructor without offer
	    public Book(String title, String author, double price, int stock) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.stock = stock;
	    }

	    // Constructor with optional offer
	    public Book(String title, String author, double price) {
	        this(title, author, price, 0);
	    }

	    public boolean reduceStock(int quantity) {
	        if (quantity <= stock) {
	            stock -= quantity;
	            return true;
	        }
	        return false;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getTitle() {
	        return title;
	    }
}
