package com.day3.swiftcart;

public class SwiftCartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product milk = new PerishableProduct("Milk", 50, "Dairy");
        Product rice = new NonPerishableProduct("Rice", 60, "Grains");

        Cart cart = new Cart();
        cart.addProduct(milk, 2);   // price * quantity
        cart.addProduct(rice, 1);

        cart.applyDiscount(10); // coupon discount
        cart.generateBill();
	}

}
