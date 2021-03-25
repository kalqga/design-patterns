package abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape == "CIRCLE") {
            return new Circle();
        }
        if(shape == "RECTANGLE") {
            return new Rectangle();
        }
        System.out.println("Cannot create shape: " + shape);
        return null;
    }

}
