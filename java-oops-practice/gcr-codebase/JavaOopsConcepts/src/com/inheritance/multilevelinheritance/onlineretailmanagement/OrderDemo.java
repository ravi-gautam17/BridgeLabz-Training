package com.inheritance.multilevelinheritance.onlineretailmanagement;

public class OrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order("101", "01-01-2026");
        System.out.println(order.getOrderStatus());

        ShippedOrder shipped = new ShippedOrder("102", "02-01-2026", "TRK123");
        System.out.println(shipped.getOrderStatus());

        DeliveredOrder delivered = new DeliveredOrder("103", "03-01-2026", "TRK456", "05-01-2026");
        System.out.println(delivered.getOrderStatus());
	}

}
