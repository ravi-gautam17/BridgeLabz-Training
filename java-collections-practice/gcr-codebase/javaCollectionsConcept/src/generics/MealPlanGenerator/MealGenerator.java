package generics.MealPlanGenerator;

public class MealGenerator {
	public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        validateMealPlan(mealPlan);
        return new Meal<>(mealPlan);
    }

    private static <T extends MealPlan> void validateMealPlan(T mealPlan) {
        if (mealPlan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid calorie value");
        }
    }
}
