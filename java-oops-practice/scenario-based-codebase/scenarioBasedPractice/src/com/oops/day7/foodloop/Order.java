package com.oops.day7.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable{
     List<FoodItem> items;
     public double totalAmount;
     
    public  Order(){
    	 totalAmount = 0;
    	 items=new ArrayList<>();
     }
     public Order(List<FoodItem> combo){
    	  this();
    	  items.addAll(combo);
    	  calculateTotal();
     }
     public void addItem(FoodItem item) {
    	 if(item.isAvailable()) {
    	    items.add(item);
    	    totalAmount+=item.price;
    	    calculateTotal();
    	 }
    	 
     }
     protected void calculateTotal() {
    	 totalAmount=0;
    	 for(FoodItem item:items ) {
    		 totalAmount+=item.price;
    	 }
    	 applyDiscount();
     }
     public void applyDiscount() {
    	 if(totalAmount>1000) {
    		 totalAmount*=0.9;
    		 
    	 }
    	 else {
    		 totalAmount*=0.95;
    	 }
     }
	
	 public void placeOrder() {
		calculateTotal();
		System.out.println("Placed order \t Total amount = "+totalAmount);
		
	 }
	 
	 public void cancelOrder() {
		items.clear();
		System.out.println("Order cancelled.");
		
	 }
     
     
}
