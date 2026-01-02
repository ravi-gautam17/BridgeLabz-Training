package com.encapsulation.librarymanagementsystem;

public interface Reservable {
	void reserveItem(String memberId);
	boolean checkAvailability();
}
