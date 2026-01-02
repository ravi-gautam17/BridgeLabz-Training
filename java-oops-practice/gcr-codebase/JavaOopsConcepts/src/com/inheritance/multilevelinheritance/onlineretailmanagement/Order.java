package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class Order {
	
	private String orderId;
	private String orderDate;
	
	public Order(String orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
		return "Order Placed";
	}
}
