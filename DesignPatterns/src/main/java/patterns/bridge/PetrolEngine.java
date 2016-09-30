package patterns.bridge;

/**
 * Created by iliyan on 9/22/2016.
 */
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started.");
    }
}
