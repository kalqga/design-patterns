package abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if(factory == "COLOR") {
            return new ColorFactory();
        }
        if(factory == "SHAPE") {
            return new ShapeFactory();
        }
        System.out.println("Cannot create factory: " + factory);
        return null;
    }
}
