package factory;

import abstracts.Shape;
import concrete.Circe;
import concrete.Rectangle;
import concrete.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        switch (shapeType){
            case "CIRCLE":
                return new Circe();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
