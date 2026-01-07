package com.day3.swiftcart;

public class PerishableProduct extends Product{
	private double discount = 0.10;
	
	public PerishableProduct(String name, double price, String category) {
		super(name, price, category);
		this.category = "Perishable";
	}
	
	 @Override
	 public double getDiscount() {
		 return 0.10; // 10% discount
	 }
}
