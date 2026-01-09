package com.day6.tourmate;

public class Activity {
	 private String activityName;
	    private double cost; // hidden cost

	    public Activity(String activityName, double cost) {
	        this.activityName = activityName;
	        this.cost = cost;
	    }

	    public double getCost() {
	        return cost;
	    }
}
