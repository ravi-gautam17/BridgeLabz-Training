package com.day6.tourmate;

public class Transport {
	private String mode;
    private double cost; // hidden cost

    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
