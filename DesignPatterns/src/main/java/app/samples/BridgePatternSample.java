package app.samples;

import app.Sample;
import patterns.bridge.ColoredCar;
import patterns.bridge.DieselEngine;
import patterns.bridge.Car;
import patterns.bridge.PetrolEngine;

/**
 * Created by iliyan on 9/22/2016.
 */
public class BridgePatternSample implements Sample {
    @Override
    public String getTitle() {
        return "Bridge pattern";
    }

    @Override
    public void execute() {
        Car car1 = new ColoredCar("Yellow", new DieselEngine());
        describeAndStartCar(car1);
        System.out.println();
        Car car2 = new ColoredCar("Black", new PetrolEngine());
        describeAndStartCar(car2);
    }

    public void describeAndStartCar(Car car) {
        System.out.println("This a " + car.getDescription());
        car.start();
    }
}
