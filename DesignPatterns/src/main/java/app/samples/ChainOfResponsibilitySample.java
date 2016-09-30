package app.samples;

import app.Sample;
import patterns.chain_of_responsibility.*;

/**
 * Created by iliyan on 9/22/2016.
 */
public class ChainOfResponsibilitySample implements Sample {
    @Override
    public String getTitle() {
        return "Chains responsibility pattern";
    }

    @Override
    public void execute() {
        DestroyPower hammerPower = new HammerPower();
        BazookaPower bazookaPower = new BazookaPower();
        NokiaPower nokiaPower = new NokiaPower();
        hammerPower.setSuccessor(bazookaPower);
        bazookaPower.setSuccessor(nokiaPower);

        Target iziTarget = new Target("mikrob", 2);
        Target intermediateTarget = new Target("batka", 35);
        Target hardTarget = new Target("nacepna batka", 52);

        hammerPower.destroy(iziTarget);
        hammerPower.destroy(intermediateTarget);
        hammerPower.destroy(hardTarget);

    }
}
