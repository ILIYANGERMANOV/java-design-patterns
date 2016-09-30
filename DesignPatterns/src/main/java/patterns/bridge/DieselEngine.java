package patterns.bridge;

/**
 * Created by iliyan on 9/22/2016.
 */
public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started.");
    }
}
