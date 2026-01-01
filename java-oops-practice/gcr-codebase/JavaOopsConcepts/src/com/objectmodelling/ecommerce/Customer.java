package com.objectmodelling.ecommerce;

import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String name;
    private ArrayList<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Communication: Customer places order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order);
    }

    public void viewOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
