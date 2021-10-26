package concrete;

import abstracts.Shape;

public class Square extends Shape {

    public Square(){
        this.type = "SQUARE";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
