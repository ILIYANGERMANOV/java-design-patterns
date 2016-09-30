package patterns.chain_of_responsibility;

/**
 * Created by iliyan on 9/22/2016.
 */
public abstract class DestroyPower {
    private DestroyPower successor;

    public void setSuccessor(DestroyPower successor) {
        this.successor = successor;
    }

    protected abstract int getDamage();

    protected abstract String getType();

    public void destroy(Target target) {
        if (getDamage() > target.getEndurance()) {
            System.out.println(getType() + '(' + getDamage()  + " dmg) will easily destroy " + target.getDescription()
                    + " with endurance " + target.getEndurance());
        } else if(successor != null) {
            successor.destroy(target);
        }
    }
}
