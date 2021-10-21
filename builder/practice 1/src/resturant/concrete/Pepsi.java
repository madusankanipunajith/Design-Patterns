package resturant.concrete;

import resturant.abstracts.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi from USA";
    }

    @Override
    public float price() {
        return 10.50f;
    }
}
