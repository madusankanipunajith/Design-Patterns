package concrete;

import abstracts.Shape;

public class Circe implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
