package patterns.decorator;

/**
 * Created by iliyan on 9/22/2016.
 */
public class WithTurbo extends CarDecorator {
    public WithTurbo(Car carToBeDecorated) {
        super(carToBeDecorated);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower() + 15;
    }
}
