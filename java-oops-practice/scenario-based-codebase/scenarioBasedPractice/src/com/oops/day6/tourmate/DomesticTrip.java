package com.day6.tourmate;
import java.util.*;

public class DomesticTrip extends Trip {
	
	public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
		super(destination, duration, transport, hotel, activities);
	}

	@Override
	public void book() {
		System.out.println("Booking Domestic Trip to " + destination);
		System.out.println("Documents required: Aadhaar ID");
		System.out.println("Total Budget: " + budget);
	}

	@Override
	public void cancel() {
		System.out.println("Domestic trip cancelled. Partial refund issued.");
	}
}
