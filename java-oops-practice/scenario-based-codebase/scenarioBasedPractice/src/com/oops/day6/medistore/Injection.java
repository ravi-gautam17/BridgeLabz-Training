package com.day6.medistore;
import java.time.LocalDate;

public class Injection extends Medicine{
	 public Injection(String name, double price, LocalDate expiryDate) {
	        super(name, price, expiryDate);
	 }

	 @Override
	 public boolean checkExpiry() {
		 return expiryDate.minusDays(15).isBefore(LocalDate.now());
	 }
}
