package fr.fortytwo.avaj.simulator;

import fr.fortytwo.avaj.simulator.vehicules.Flyable;
import java.util.List;

public abstract class Tower {
    private List<Flyable> observers;

    public void register(Flyable flyable) {
        //ajout du flyable a observer
    }

    public void unregister(Flyable flyable) {
        //retrait
    }

    protected void conditionsChanged() {

    }
}