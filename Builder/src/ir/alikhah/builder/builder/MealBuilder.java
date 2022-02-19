package ir.alikhah.builder.builder;

import ir.alikhah.builder.entity.ChickenBurger;
import ir.alikhah.builder.entity.Coke;
import ir.alikhah.builder.entity.Pepsi;
import ir.alikhah.builder.entity.VegBurger;

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
		      return meal;
		   }
}
