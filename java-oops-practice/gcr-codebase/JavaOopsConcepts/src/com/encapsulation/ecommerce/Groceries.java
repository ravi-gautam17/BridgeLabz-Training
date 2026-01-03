package com.encapsulation.ecommerce;

public class Groceries extends Product{
	public Groceries(String productID, String name, double price) {
		super(productID, name, price);
	}
	
	@Override
	public double calculateDiscount() {
		return 0;
	}
}
