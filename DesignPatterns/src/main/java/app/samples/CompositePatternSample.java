package app.samples;

import app.Sample;
import patterns.composite.Bmw;
import patterns.composite.CompositeBmw;
import patterns.composite.E36;
import patterns.composite.E46;

/**
 * Created by iliyan on 9/26/2016.
 */
public class CompositePatternSample implements Sample {
    @Override
    public String getTitle() {
        return "Composite pattern";
    }

    @Override
    public void execute() {
        CompositeBmw compositeBmw = new CompositeBmw();
        CompositeBmw compositeBmw1 = new CompositeBmw();
        CompositeBmw compositeBmw2 = new CompositeBmw();

        compositeBmw1.add(new E36());
        compositeBmw1.add(new E36());

        compositeBmw2.add(new E46());
        compositeBmw2.add(new E46());
        compositeBmw2.add(new E46());

        compositeBmw.add(() -> System.out.println("E34 is drifting."));
        compositeBmw.add(compositeBmw1);
        compositeBmw.add(compositeBmw2);
        compositeBmw.add(compositeBmw1);

        compositeBmw.drift();
    }
}
