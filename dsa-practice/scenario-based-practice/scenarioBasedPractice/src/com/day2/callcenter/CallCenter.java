package com.day2.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {

    HashMap<String,Integer> callCount=new HashMap<>();
    PriorityQueue<String> vipQueue=new PriorityQueue<>();
    Queue<String> normalQueue=new LinkedList<>();
    
    
    public void handleIncomingCall(String customerId, boolean isVIP) {
        // handling call
    	 callCount.put(customerId,callCount.getOrDefault(customerId, 0)+1);
    	 
    	 // check if VIP or not
    	 if(isVIP) {
    		 vipQueue.add(customerId);
    	 }
    	 else {
    		 normalQueue.add(customerId);
    	 }
    }
    
    public void serveCustomer() {
    	 String customer=null;
    	 if(!vipQueue.isEmpty()) {
    		 customer=vipQueue.remove();
    	 }
    	 else if(!normalQueue.isEmpty()) {
    		 customer=normalQueue.remove();
    	 }
    	 else {
    		 System.out.println("No customers to serve");
    		 return;
    	 }
    	 System.out.println("Serving customer : "+customer);
    }
    public void callFrequency(String customerId) {
    	if(callCount.containsKey(customerId)) {
    		System.out.println("Customer with id "+customerId+" has called "+callCount.get(customerId)+" times");
    	}
    	else {
    		System.out.println("Customer with id "+customerId+" has not called");
    	}
    }
    
}
