
package com.encapsulation.onlinefoodsystem;

public class NonVegItem extends FoodItem{
	private double surcharge = 2.50; 

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (surcharge * getQuantity());
    }
}
