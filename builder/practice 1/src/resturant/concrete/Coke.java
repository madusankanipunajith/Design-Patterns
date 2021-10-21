package resturant.concrete;

import resturant.abstracts.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coca.... from Pakistan";
    }

    @Override
    public float price() {
        return 10.00f;
    }
}
