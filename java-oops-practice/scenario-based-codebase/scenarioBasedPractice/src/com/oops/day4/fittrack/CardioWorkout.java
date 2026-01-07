package com.day4.fittrack;

public class CardioWorkout extends Workout{
	
	public CardioWorkout(int duration) {
		 super(duration);
		 this.type = "Cardio";
	 }
	
	@Override
	public int calculateCalories(double weight) {
		 int calories = (int) (getDuration() * weight * 0.12);
		 setCaloriesBurned(calories);
		 return calories;
	}
}
