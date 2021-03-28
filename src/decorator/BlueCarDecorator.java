package decorator;

public class BlueCarDecorator extends CarDecorator {

    public BlueCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    public void create() {
        decoratedCar.create();
        this.setBlueColor(decoratedCar);
    }

    private void setBlueColor(Car decoratedCar) {
        System.out.println("Setting blue to the decorated car");
    }

}
