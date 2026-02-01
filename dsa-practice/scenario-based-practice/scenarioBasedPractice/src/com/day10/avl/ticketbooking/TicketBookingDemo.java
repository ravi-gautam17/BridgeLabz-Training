package com.day10.avl.ticketbooking;

public class TicketBookingDemo {

	public static void main(String[] args) {

		AVLEventBooking booking = new AVLEventBooking();

        booking.root = booking.insert(booking.root, 1000, "Morning Concert");
        booking.root = booking.insert(booking.root, 1400, "Tech Talk");
        booking.root = booking.insert(booking.root, 1800, "Evening Show");
        
        System.out.println("Upcoming Events......:");
        booking.inorder(booking.root);
	}

}