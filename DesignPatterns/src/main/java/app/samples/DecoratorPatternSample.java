package app.samples;

import app.Sample;
import patterns.decorator.Car;
import patterns.decorator.SimpleCar;
import patterns.decorator.WithChip;
import patterns.decorator.WithTurbo;

/**
 * Created by iliyan on 9/22/2016.
 */
public class DecoratorPatternSample implements Sample {
    @Override
    public String getTitle() {
        return "Decorator pattern";
    }

    @Override
    public void execute() {
        Car simpleCar = new SimpleCar();
        printCarDescription(simpleCar);
        Car carWithTurbo = new WithTurbo(new SimpleCar());
        printCarDescription(carWithTurbo);
        Car carWithChipAndTurbo = new WithChip(
                new WithTurbo(new SimpleCar()));
        printCarDescription(carWithChipAndTurbo);
        Car carWithTwinTurboAndChip = new WithTurbo(new WithTurbo(
                new WithChip(new SimpleCar())));
        printCarDescription(carWithTwinTurboAndChip);
    }

    private void printCarDescription(Car car) {
        System.out.println("Car with " + car.getHorsePower() + " hp that costs " + car.getPrice() + ".");
    }
}
