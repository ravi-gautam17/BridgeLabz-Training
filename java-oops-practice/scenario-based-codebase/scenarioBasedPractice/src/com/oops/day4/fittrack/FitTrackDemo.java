package com.day4.fittrack;

public class FitTrackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserProfile user = new UserProfile("Swaraj", 23, 70.5, "Weight Loss");
		 user.showProfile();

		 Workout cardio = new CardioWorkout(30);
		 cardio.startWorkout();
		 int calories = cardio.calculateCalories(user.getWeight());
		 cardio.stopWorkout();
		 cardio.showWorkoutSummary();

		 int remaining = user.calculateProgress(calories);
		 System.out.println("calories remaining for today: " + remaining);
	}

}
