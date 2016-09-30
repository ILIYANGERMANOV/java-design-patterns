package patterns.decorator;

/**
 * Created by iliyan on 9/22/2016.
 */
public abstract class CarDecorator implements Car {
    private Car carToBeDecorated;

    public CarDecorator(Car carToBeDecorated) {
        this.carToBeDecorated = carToBeDecorated;
    }

    @Override
    public int getPrice() {
        return carToBeDecorated.getPrice();
    }

    @Override
    public int getHorsePower() {
        return carToBeDecorated.getHorsePower();
    }
}
