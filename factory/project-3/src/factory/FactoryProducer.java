package factory;

import abstracts.AbstractFactory;
import concrete.RoundedShapeFactory;
import concrete.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
