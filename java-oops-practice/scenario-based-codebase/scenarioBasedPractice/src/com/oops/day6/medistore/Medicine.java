package com.day6.medistore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {
	 protected String name;
	    protected double price;
	    protected LocalDate expiryDate;

	    private int quantity;       
	    private double costPrice;   // Sensitive pricing 

	    // constructor with default quantity
	    public Medicine(String name, double price, LocalDate expiryDate) {
	        this(name, price, expiryDate, 50); // default quantity
	    }

	    // constructor with custom quantity
	    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.expiryDate = expiryDate;
	        this.quantity = quantity;
	        this.costPrice = price * 0.6; 
	    }

	    protected boolean reduceStock(int qty) {
	        if (qty <= quantity) {
	            quantity -= qty;
	            return true;
	        }
	        return false;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    @Override
	    public double sell(int qty) {
	        if (!checkExpiry() && reduceStock(qty)) {
	            return calculateFinalPrice(qty);
	        }
	        System.out.println("Cannot sell expired or insufficient stock: " + name);
	        return 0;
	    }

	    private double calculateFinalPrice(int qty) {
	        double total = price * qty;
	        double discount = total * 0.05;
	        return total - discount;
	    }
}
