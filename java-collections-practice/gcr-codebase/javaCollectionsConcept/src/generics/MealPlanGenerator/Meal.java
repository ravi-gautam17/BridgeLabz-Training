package generics.MealPlanGenerator;

public class Meal<T extends MealPlan> {
	private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    @Override
    public String toString() {
        return "Meal Plan: " + mealPlan.getMealType() +
               ", Calories: " + mealPlan.getCalories();
    }
}
