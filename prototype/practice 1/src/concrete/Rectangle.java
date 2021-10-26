package concrete;

import abstracts.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        this.type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
