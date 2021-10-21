package resturant.abstracts;

import resturant.concrete.Bottle;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
