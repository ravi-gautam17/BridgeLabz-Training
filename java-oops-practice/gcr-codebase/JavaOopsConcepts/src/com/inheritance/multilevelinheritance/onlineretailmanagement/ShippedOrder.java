package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class ShippedOrder extends Order{
	private String trackingNumber;
	
	public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	public String getOrderStatus() {
		return "Order Shipped";
	}
}
