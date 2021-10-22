import abstracts.AbstractFactory;
import abstracts.Shape;
import factory.FactoryProducer;

public class Demo {

    public static void main(String[] args) {

        AbstractFactory abstractFactory =  FactoryProducer.getFactory(true);

        Shape shape1 = abstractFactory.getShape("SQUARE");
        shape1.draw();

    }
}
