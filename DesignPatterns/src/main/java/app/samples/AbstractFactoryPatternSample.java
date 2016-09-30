package app.samples;

import patterns.abstact_factory.Computer;
import patterns.abstact_factory.ComputerFactory;
import patterns.abstact_factory.LaptopFactory;
import patterns.abstact_factory.PCFactory;
import app.Sample;

/**
 * Created by iliyan on 9/22/2016.
 */
public class AbstractFactoryPatternSample implements Sample {
    @Override
    public String getTitle() {
        return "Abstract factory pattern";
    }

    @Override
    public void execute() {
        ComputerFactory computerFactory = new PCFactory();
        createAndPrintComputer(computerFactory);
        computerFactory = new LaptopFactory();
        createAndPrintComputer(computerFactory);
        computerFactory = new PCFactory();
        createAndPrintComputer(computerFactory);
    }

    private void createAndPrintComputer(ComputerFactory computerFactory) {
        Computer computer = computerFactory.createComputer();
        System.out.println("Created: " + computer.getDescription());
    };
}
