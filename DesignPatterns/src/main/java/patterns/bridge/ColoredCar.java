package patterns.bridge;

/**
 * Created by iliyan on 9/22/2016.
 */
public class ColoredCar extends Car {
    String color;

    public ColoredCar(String color, Engine engine) {
        super(engine);
        this.color = color;
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public String getDescription() {
        return color + " car.";
    }
}
