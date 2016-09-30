package patterns.chain_of_responsibility;

/**
 * Created by iliyan on 9/22/2016.
 */
public class BazookaPower extends DestroyPower {
    @Override
    protected int getDamage() {
        return 50;
    }

    @Override
    protected String getType() {
        return "Bazooka";
    }
}
