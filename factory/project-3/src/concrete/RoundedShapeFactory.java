package concrete;

import abstracts.AbstractFactory;
import abstracts.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        switch (shapeType){
            case "SQUARE":
                return new RoundedSquare();

            case "RECTANGLE":
                return new RoundedRectangle();

            default:
                return null;
        }
    }
}
