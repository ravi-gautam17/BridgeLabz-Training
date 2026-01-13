package com.day2.traincompanion;

public class Passenger {
    String passengerName;
    Compartment currentCompartment;
    
    public Passenger(String passengerName, Compartment startCompartment) {
    	this.passengerName=passengerName;
    	this.currentCompartment=startCompartment;   	
    }
}
