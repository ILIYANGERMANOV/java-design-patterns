package patterns.chain_of_responsibility;

/**
 * Created by iliyan on 9/22/2016.
 */
public class Target {
    private String description;
    private int endurance;

    public Target(String description, int endurance) {
        this.description = description;
        this.endurance = endurance;
    }

    public String getDescription() {
        return description;
    }

    public int getEndurance() {
        return endurance;
    }
}
