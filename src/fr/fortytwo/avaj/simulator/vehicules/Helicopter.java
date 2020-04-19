package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {}

    public void registerTower(WeatherTower weatherTower) {};
}