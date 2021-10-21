package resturant.concrete;

import resturant.abstracts.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}
