package abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == "BLUE") {
            return new Blue();
        }
        if(color == "RED") {
            return new Red();
        }
        System.out.println("Cannot create color: " + color);
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
