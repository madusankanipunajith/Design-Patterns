package resturant.concrete;

import resturant.abstracts.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 16.90f;
    }
}
