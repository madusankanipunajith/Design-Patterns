package resturant.concrete;

import resturant.abstracts.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
