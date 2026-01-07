package com.day3.swiftcart;
import java.util.*;

public class Cart implements ICheckout{
	private List<Product> products;
    private double totalPrice;

    // Constructor without pre-selected items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; // operator usage
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double discount = 0;

        for (Product p : products) {
            discount += p.getPrice() * p.getDiscount(); // polymorphism
        }

        totalPrice = totalPrice - discount - coupon; // operator usage
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.getPrice());
        }
        System.out.println("Total Price: ₹" + totalPrice);
    }
}
