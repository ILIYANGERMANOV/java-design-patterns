package patterns.abstact_factory;

/**
 * Created by iliyan on 9/22/2016.
 */
public class PCFactory implements  ComputerFactory{
    @Override
    public Computer createComputer() {
        return new PC();
    }
}
