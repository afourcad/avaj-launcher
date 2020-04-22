package fr.fortytwo.avaj.simulator;

import fr.fortytwo.avaj.simulator.vehicules.Baloon;
import fr.fortytwo.avaj.simulator.vehicules.Flyable;

import java.util.ArrayList;
import java.util.List;

public abstract class Tower {
    private final List<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyable) {
        this.observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        this.observers.remove(flyable);
    }

    protected void conditionsChanged() {
        for (Flyable flyable: this.observers) {
            flyable.updateConditions();

            if(flyable.getLanded()){
                unregister(flyable);
            }
        }
    }

    public List<Flyable> getObservers(){
        return this.observers;
    }

   public void towerSays(String type, String name, long id){
        System.out.println("Tower says: " + type + "#" + name + "(" + id + ")" + " registered to tower");
    }
}