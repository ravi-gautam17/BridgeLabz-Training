package com.day6.tourmate;
import java.util.List;
import java.util.ArrayList;

public class TourMateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport flight = new Transport("Flight", 25000);
        Hotel hotel = new Hotel("Sea View Resort", 15000);

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("City Tour", 3000));
        activities.add(new Activity("Scuba Diving", 5000));

        Trip domesticTrip = new DomesticTrip(
                "Goa", 5, flight, hotel, activities
        );

        Trip internationalTrip = new InternationalTrip("Bali", 7, flight, hotel, activities);

        domesticTrip.book();
        System.out.println();

        internationalTrip.book();
	}

}
