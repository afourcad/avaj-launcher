package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.WeatherTower;
import fr.fortytwo.avaj.weather.Coordinates;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
//         SUN - Latitude increases with 10, Height increases with 2
// ◦ RAIN - Latitude increases with 5
// ◦ FOG - Latitude increases with 1
// ◦ SNOW - Height decreases with 7

    };
    
    public void registerTower(WeatherTower weatherTower) {};
}