package patterns.chain_of_responsibility;

/**
 * Created by iliyan on 9/22/2016.
 */
public class NokiaPower extends DestroyPower {
    @Override
    protected int getDamage() {
        return 9999999;
    }

    @Override
    protected String getType() {
        return "Nokia";
    }
}
