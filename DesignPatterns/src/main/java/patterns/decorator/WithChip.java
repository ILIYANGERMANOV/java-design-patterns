package patterns.decorator;

/**
 * Created by iliyan on 9/22/2016.
 */
public class WithChip extends CarDecorator {
    public WithChip(Car carToBeDecorated) {
        super(carToBeDecorated);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 400;
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower() + 30;
    }
}
