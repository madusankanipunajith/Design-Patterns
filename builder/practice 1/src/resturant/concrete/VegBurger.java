package resturant.concrete;

import resturant.abstracts.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 12.50f;
    }
}
