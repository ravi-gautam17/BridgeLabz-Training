package com.day3.swiftcart;

public class NonPerishableProduct extends Product{
	private double discount = 0.05;
	
	public NonPerishableProduct(String name, double price, String category) {
		super(name, price, category);
		this.category = "NonPerishable";
	}
	
	@Override
    public double getDiscount() {
        return 0.05; // 5% discount
    }
}
