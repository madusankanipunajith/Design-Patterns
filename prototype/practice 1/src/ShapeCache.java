import abstracts.Shape;
import concrete.Circle;
import concrete.Rectangle;
import concrete.Square;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<Integer, Shape> shapeMap  = new Hashtable<Integer, Shape>();

    public static Shape getShape(int shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId(2);
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
