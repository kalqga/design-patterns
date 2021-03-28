package decorator;

public class CarDecorator implements Car {

    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void create() {
        this.decoratedCar.create();
    }

}
