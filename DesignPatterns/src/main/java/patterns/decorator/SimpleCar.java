package patterns.decorator;

/**
 * Created by iliyan on 9/22/2016.
 */
public class SimpleCar implements Car {
    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getHorsePower() {
        return 90;
    }
}
