package com.day9.bst.ecommerceinventory;

public class ProductNode {

	int sku;
	String name;
	double price;
	ProductNode left, right;
	
	public ProductNode(int sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.price = price;
		left = right = null;
	}
	
	
}
