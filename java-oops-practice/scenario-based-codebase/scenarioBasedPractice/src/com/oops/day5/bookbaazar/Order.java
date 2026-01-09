package com.day5.bookbaazar;
import java.util.*;

public class Order {
	private String userName;
    private Map<Book, Integer> items = new HashMap<>();

    private String orderStatus = "CREATED"; // restricted access

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Not enough stock for: " + book.getTitle());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();
            total += book.applyDiscount(book.getPrice(), qty);
        }
        return total;
    }

    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
