package com.day9.tailorshop;

import java.time.LocalDateTime;

public class Order {
    String orderId;
    LocalDateTime deadline;
    
    public Order(String orderId, String time) {
    	    this.orderId=orderId;
    	    LocalDateTime temp=LocalDateTime.parse(time);
    	    this.deadline=temp;
    }
}
