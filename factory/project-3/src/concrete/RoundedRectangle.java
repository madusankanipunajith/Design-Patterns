package concrete;

import abstracts.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rounded Rectangle: Draw()");
    }
}
