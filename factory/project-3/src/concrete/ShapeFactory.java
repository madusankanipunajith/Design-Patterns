package concrete;

import abstracts.AbstractFactory;
import abstracts.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();

            default:
                return null;
        }
    }
}
