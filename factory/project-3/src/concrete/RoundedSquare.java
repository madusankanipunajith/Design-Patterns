package concrete;

import abstracts.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Square: Draw()");
    }
}
