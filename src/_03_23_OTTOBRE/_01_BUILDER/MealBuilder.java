package _03_23_OTTOBRE._01_BUILDER;

public class MealBuilder {
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      meal.addItem(new Wine());
	      return meal;
	   }
	   
	   public Meal prepareDrinks() {
		   Meal meal=new Meal();
		   meal.addItem(new Wine());
		   meal.addItem(new Wine());
		   return meal;
	   }
}
