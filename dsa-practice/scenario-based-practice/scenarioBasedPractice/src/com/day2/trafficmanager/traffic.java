package com.day2.trafficmanager;

public class traffic {
	private Node head;
	
	
	public void addCar(String vehicleId, String carName) {
		Node newNode = new Node(vehicleId, carName);
		if(head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.next = head;
	}
	
	public void removeCar(String vehicleID) {
		if(head == null) {
			System.out.println("Nothing to remove....");
			return;
		}
		
		Node curr = head;
		Node prev = null;
		
		do {
			if(curr.vehicleId.equals(vehicleID)) {
				if(curr == head && curr.next == head) {
					head = null;
				}
				else if(curr == head) {
					Node temp = head;
					while(temp.next != head) {
						temp = temp.next;
					}
					
					head = head.next;
					temp.next = head;
				}
				else {
					prev.next = curr.next;
				}
				
				System.out.println("Car " + vehicleID + " exited roundabout.....");
                return;
			}
			prev = curr;
			curr = curr.next;
		}while(curr != head);	
		System.out.println("Car not found in roundabout.");
	}
	
	public void displayCars() {
		if(head == null) {
			System.out.println("Currently no car in roundabout....");
			return;
		}
		
		Node temp = head;
		System.out.print("Roundabout: ");
		do {
			System.out.print(temp.vehicleId + " -> ");
			temp = temp.next;
		} while (temp != head);
		
		System.out.println("( Back to: " + head.vehicleId + " )");
	}
}
