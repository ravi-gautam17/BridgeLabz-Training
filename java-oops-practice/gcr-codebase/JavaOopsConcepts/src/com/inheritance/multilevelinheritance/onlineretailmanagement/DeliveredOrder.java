package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class DeliveredOrder extends ShippedOrder{
	
	private String deliveryDate;
	
	public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	public String getOrderStatus() {
		return "Order Delivered";
	}
}
