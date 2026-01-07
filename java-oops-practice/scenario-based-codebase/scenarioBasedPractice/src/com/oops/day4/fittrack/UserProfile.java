package com.day4.fittrack;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private String goal;
	
	private int dailyTarget = 500; 
	
	// with custom goals
	public UserProfile(String name, int age, double weight, String goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
	}
	
	// with default goal
	public UserProfile(String name, int age, double weight) {
		this(name, age, weight, "Weight Gain");
	}
	
	public double getWeight() {
        return weight;
    }

    // Operator usage
    public int calculateProgress(int caloriesBurned) {
        return dailyTarget - caloriesBurned;
    }

    public void showProfile() {
    	System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Target: " + dailyTarget + " calories");
    }
}
