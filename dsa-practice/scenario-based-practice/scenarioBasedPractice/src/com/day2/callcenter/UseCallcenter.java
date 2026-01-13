package com.day2.callcenter;

public class UseCallcenter {

	public static void main(String[] args) {
		CallCenter cust=new CallCenter();
		cust.handleIncomingCall("A101", false);
		cust.handleIncomingCall("B101", true);
		cust.handleIncomingCall("A101", false);
		cust.handleIncomingCall("A101", false);
		
		cust.callFrequency("A101");
		cust.serveCustomer();
		cust.serveCustomer();
		cust.serveCustomer();
		cust.serveCustomer();
		cust.serveCustomer();
		

	}

}
