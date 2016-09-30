package patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iliyan on 9/26/2016.
 */
public class CompositeBmw implements Bmw {
    private List<Bmw> bmwList;

    public CompositeBmw() {
        this.bmwList = new ArrayList<>();
    }

    public void add(Bmw bmw) {
        bmwList.add(bmw);
    }

    public void remove(Bmw bmw) {
        bmwList.remove(bmw);
    }

    @Override
    public void drift() {
        for (Bmw bmw : bmwList) {
            bmw.drift();
        }
    }
}
