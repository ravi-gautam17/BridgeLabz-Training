package com.day2.traincompanion;

public class Main {
  public static void main(String[] args) {
	  TrainCompanion train=new TrainCompanion();
	  train.addCompartment("B1");
	  train.addCompartment("B2");
	  train.addCompartment("B3");
	  train.addCompartment("B6");
	  train.addCompartment("A1");
	  train.addCompartment("A2");
	  
	  train.addService(train.head.next.next, "Pantry");
	  train.addService(train.tail, "Wi-fi");
	  Passenger p1=new Passenger("Ravi",train.head);
	  
	  train.moveBackward(p1);
	  train.moveForward(p1);
	  
	  train.moveForward(p1);
	  
	  train.showAdjacentCompartment(train.tail.prev);
	  
	  train.searchService("Wi-fi");
	  
  }
}
