package com.day6.tourmate;
import java.util.List;

public class InternationalTrip extends Trip{
	  public InternationalTrip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
		  super(destination, duration, transport, hotel, activities);
	  }

	  @Override
	  public void book() {
		  System.out.println("Booking International Trip to " + destination);
		  System.out.println("Documents required: Passport & Visa");
		  System.out.println("Total Budget: " + budget);
	  }

	  @Override
	  public void cancel() {
		  System.out.println("International trip cancelled. Refund after penalties.");
	  }
}
