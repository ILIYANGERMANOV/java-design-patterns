package patterns.chain_of_responsibility;

/**
 * Created by iliyan on 9/22/2016.
 */
public class HammerPower extends DestroyPower {
    @Override
    protected int getDamage() {
        return 5;
    }

    @Override
    protected String getType() {
        return "Hammer";
    }
}
