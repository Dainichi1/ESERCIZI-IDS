package _02_09_OTTOBRE._04_BUILDER;

public class BuilderPatternDemo {
	   public static void main(String[] args) {
		   
		      MealBuilder mealBuilder = new MealBuilder();

		      Meal vegMeal = mealBuilder.prepareVegMeal();
		      System.out.println("Veg Meal");
		      vegMeal.showItems();
		      System.out.println("Total Cost: " + vegMeal.getCost());

		      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		      System.out.println("\n\nNon-Veg Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + nonVegMeal.getCost());
		      
		      Meal drinkMeal = mealBuilder.prepareDrinks();
		      System.out.println("\n\nWine Meal");
		      drinkMeal.showItems();
		      System.out.println("Total Cost: " + drinkMeal.getCost());
		   }
}
