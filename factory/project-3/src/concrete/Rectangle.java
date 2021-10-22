package concrete;

import abstracts.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: Draw()");
    }
}
