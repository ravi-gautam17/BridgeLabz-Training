package com.day6.medistore;
import java.time.LocalDate;

public class Syrup extends Medicine{
	public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicines expire earlier (30 days buffer)
        return expiryDate.minusDays(30).isBefore(LocalDate.now());
    }
}
