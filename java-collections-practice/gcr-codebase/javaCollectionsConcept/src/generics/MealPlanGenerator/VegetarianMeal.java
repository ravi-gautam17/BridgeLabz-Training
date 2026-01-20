package generics.MealPlanGenerator;

public class VegetarianMeal implements MealPlan{

	@Override
	public String getMealType() {
        return "Vegetarian";
    }
	
	@Override
    public int getCalories() {
        return 1800;
    }
}
