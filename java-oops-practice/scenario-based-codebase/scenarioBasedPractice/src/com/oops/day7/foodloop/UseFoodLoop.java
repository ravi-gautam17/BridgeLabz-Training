package com.oops.day7.foodloop;

import java.util.List;
import java.util.ArrayList;

public class UseFoodLoop {

	public static void main(String[] args) {
		VegItem food1=new VegItem("Burger",600,2);
		NonVegItem food2=new NonVegItem("Chicken",400,1);
		VegItem food3=new VegItem("Pizza",100,3);
		VegItem food4=new VegItem("Momos",300,3);
        List<FoodItem> items=new ArrayList<>();
        items.add(food3);
        items.add(food2);
        Order ord=new Order(items);
        ord.addItem(food1);
        ord.addItem(food4);
        ord.calculateTotal();
        ord.placeOrder();
        ord.cancelOrder();

	}

}
