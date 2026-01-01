package com.objectmodelling.ecommerce;

public class ECommerceDemo {
    public static void main(String[] args) {

        Customer customer = new Customer(101, "Amit");

        Product p1 = new Product(1, "Laptop", 60000);
        Product p2 = new Product(2, "Headphones", 3000);
        Product p3 = new Product(3, "Mouse", 800);

        Order order1 = new Order(5001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(5002);
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println();
        customer.viewOrders();
    }
}
