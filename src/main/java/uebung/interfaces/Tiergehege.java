package uebung.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Tiergehege {

    private List<Sozialisiert> tiere = new ArrayList<>();

    public void add(Sozialisiert tier) {
        tiere.add(tier);
    }

    public void starteFuetterung() {
        for (Sozialisiert s: tiere) {
            s.frisst();
        }
    }

    public void starteNachruhe() {
        for (Sozialisiert s: tiere) {
            s.schlaeft();
        }
    }

}
