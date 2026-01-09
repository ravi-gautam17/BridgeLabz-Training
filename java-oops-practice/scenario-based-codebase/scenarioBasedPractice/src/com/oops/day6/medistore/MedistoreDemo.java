package com.day6.medistore;
import java.time.LocalDate;

public class MedistoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Medicine tablet = new Tablet("Paracetamol", 5.0, LocalDate.of(2026, 5, 10));

	        Medicine syrup = new Syrup("Cough Syrup", 120.0, LocalDate.of(2026, 2, 1));

	        System.out.println("Tablet Sale Bill: ₹" + tablet.sell(10));
	        System.out.println("Syrup Sale Bill: ₹" + syrup.sell(2));

	        System.out.println("Remaining Tablets: " + tablet.getQuantity());
	        System.out.println("Remaining Syrup: " + syrup.getQuantity());
	}

}
