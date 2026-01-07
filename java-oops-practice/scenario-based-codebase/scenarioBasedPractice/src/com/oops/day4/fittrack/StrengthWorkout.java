package com.day4.fittrack;

public class StrengthWorkout extends Workout{
	
	public StrengthWorkout(int duration) {
        super(duration);
        this.type = "Strength";
    }
	
	@Override
    public int calculateCalories(double weight) {
        int calories = (int) (getDuration() * weight * 0.08);
        setCaloriesBurned(calories);
        return calories;
    }
}
