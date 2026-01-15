package com.day2.trafficmanager;

public class VehicleQueue {

	private String[] queue;
	private int front = -1, rear = -1;
	private int size;
	
	public VehicleQueue(int size) {
		this.size = size;
		queue = new String[size];
	}
	
	public void addToQueue(String vehicleId) {
		if(rear == size-1) {
			System.out.println("Queue Overflow! Vehicle waiting area full....");
			return;
		}
		
		if(front == -1)
			front = 0;
		queue[++rear] = vehicleId;
		System.out.println("Vehicle " + vehicleId + " added to waiting queue.....");
	}
	
	public String removeFromQueue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue Underflow! No vehicles waiting.");
            return null;
		}
		
		return queue[front++];
	}
}	
