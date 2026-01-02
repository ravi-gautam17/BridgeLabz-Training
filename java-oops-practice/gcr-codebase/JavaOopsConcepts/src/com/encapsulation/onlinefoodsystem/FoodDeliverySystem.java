package com.encapsulation.onlinefoodsystem;
import java.util.*;

public class FoodDeliverySystem {
	public static void main(String[] args) {
		List<FoodItem> cart = new ArrayList<>();
        
        VegItem paneer = new VegItem("Paneer Tikka", 12.0, 2);
        paneer.applyDiscount(10); 
        
        cart.add(paneer);
        cart.add(new NonVegItem("Chicken Burger", 15.0, 1));
        cart.add(new VegItem("Garlic Bread", 5.0, 1));

        double grandTotal = 0;

        System.out.println("--- Your Order Receipt ---");
        for (FoodItem item : cart) {
            System.out.println(item.getItemDetails());
            
            double itemTotal = item.calculateTotalPrice();
            grandTotal += itemTotal;
            
            
            if (item instanceof Discountable) {
                System.out.println(" > " + ((Discountable) item).getDiscountDetails());
            }
            
            System.out.println(" Subtotal: $" + itemTotal);
            System.out.println("--------------------------");
        }

        System.out.println("TOTAL AMOUNT TO PAY: $" + grandTotal);
    }
}
