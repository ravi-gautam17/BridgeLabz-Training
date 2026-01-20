package generics.MealPlanGenerator;

public class VeganMeal implements MealPlan{

	@Override
	public String getMealType() {
		// TODO Auto-generated method stub
		return "Vegan";
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return 1700;
	}
	
}
