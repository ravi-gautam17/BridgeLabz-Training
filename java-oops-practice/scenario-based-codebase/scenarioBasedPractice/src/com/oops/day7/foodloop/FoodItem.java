package com.oops.day7.foodloop;

public class FoodItem {
    protected String name;
    protected String category;
    protected double price;
    protected boolean availability;
    
    private int stock;
    
    public FoodItem(String name,String category,double price,int stock){
    	this.name=name;
    	this.category=category;
    	this.price=price;
    	this.availability=(stock>0);
    }
    
    public boolean isAvailable() {
          return availability;    	
    }
    public double getPrice() {
    	 return this.price;
    }
    public void reduceStock() {
    	if(stock>0) {
    		stock--;
    	}
    }

	
    
    
}
