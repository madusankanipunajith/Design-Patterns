package resturant.abstracts;

import resturant.concrete.Wrapper;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
