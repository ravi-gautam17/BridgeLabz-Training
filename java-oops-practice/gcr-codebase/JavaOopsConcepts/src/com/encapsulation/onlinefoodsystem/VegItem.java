package com.encapsulation.onlinefoodsystem;

public class VegItem extends FoodItem implements Discountable{
	private double discountAmount = 0;

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discountAmount = (getPrice() * getQuantity()) * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount Applied: $" + discountAmount;
    }
}
