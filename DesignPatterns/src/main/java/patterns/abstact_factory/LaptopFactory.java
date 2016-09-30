package patterns.abstact_factory;

/**
 * Created by iliyan on 9/22/2016.
 */
public class LaptopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}
