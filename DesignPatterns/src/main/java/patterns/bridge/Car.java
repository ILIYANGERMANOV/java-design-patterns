package patterns.bridge;

/**
 * Created by iliyan on 9/22/2016.
 */
public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void start();

    public abstract String getDescription();
}
