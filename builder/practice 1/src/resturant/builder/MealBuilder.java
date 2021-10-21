package resturant.builder;

import resturant.concrete.ChickenBurger;
import resturant.concrete.Coke;
import resturant.concrete.Pepsi;
import resturant.concrete.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();         // create new List<Item>
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();         // create new List<Item>
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
