package com.day2.trafficmanager;

public class Node {
	
	public String vehicleName;
	public String vehicleId;
	Node next;
	
	public Node(String vehicleId, String vehicleName) {
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.next = null;
	}
}
