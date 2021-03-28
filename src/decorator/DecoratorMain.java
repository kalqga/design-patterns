package decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Car lada = new Lada();
        lada.create();

        Car newLada = new Lada();
        Car blueLada = new BlueCarDecorator(newLada);
        blueLada.create();

    }

}
