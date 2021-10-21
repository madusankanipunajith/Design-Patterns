package resturant;

import resturant.builder.Meal;
import resturant.builder.MealBuilder;

public class Demo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal veg = builder.prepareVegMeal();
        Meal nonVeg = builder.prepareNonVegMeal();

        System.out.println("...Veg Meal...\n");
        veg.showItems();
        System.out.println("Total Cost: " + veg.getCost());
    }
}
