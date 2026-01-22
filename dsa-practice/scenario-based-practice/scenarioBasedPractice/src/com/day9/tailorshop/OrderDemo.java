package com.day9.tailorshop;

public class OrderDemo {
  public static void main(String[] args) {
	  Order[] orders = {new Order("O101", "2026-01-25T10:00"), new Order("O102", "2026-01-22T09:30"), new Order("O103", "2026-01-24T14:00"), new Order("O104", "2026-01-23T16:45")};
	  InsertionSort.insertionSort(orders);
	  
	  for(Order order:orders) {
		  System.out.println(order.orderId+" -> "+order.deadline);
	  }
  }
}
