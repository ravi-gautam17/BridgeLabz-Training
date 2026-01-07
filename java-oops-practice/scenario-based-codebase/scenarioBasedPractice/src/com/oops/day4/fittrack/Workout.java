package com.day4.fittrack;
import java.util.*;

public class Workout implements ITrackable{
	private int duration; // in minutes
	private int caloriesBurned;
	protected String type;
	
	public Workout(int duration) {
		this.duration = duration;
	}
	
	//logs 
	private List<String> workoutLogs = new ArrayList<>();
	
	public int calculateCalories(double caloriesBurned) {
		System.out.println("Workout class");
		return 0;
	}
	
	protected void setCaloriesBurned(int calories) {
		this.caloriesBurned = calories;
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	@Override
	public void startWorkout() {
		workoutLogs.add(type + " workout started");
		System.out.println(type + " workout started");
	}

	@Override
	public void stopWorkout() {
		workoutLogs.add(type + " workout stopped");
		System.out.println(type + " workout stopped");
	}

	public void showWorkoutSummary() {
		System.out.println("------------Workout Summary------------");
		System.out.println("Workout Type: " + type);
		System.out.println("Duration: " + duration + " mins");
		System.out.println("Calories Burned: " + caloriesBurned);
	}

	protected int getDuration() {
		return duration;
	}
}
