package concrete;

import abstracts.Shape;

public class Circle extends Shape {

    public Circle(){
        this.type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
