package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch(weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                this.coordinates.updateCoordinates(0, 10, 2);
                //TODO: cool phrase;
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(0, 5, 0);
                //TODO: cool phrase;
                break;
            case "FOG":
                this.coordinates.updateCoordinates(0, 1, 0);
                //TODO: cool phrase;
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -7);
                //TODO: cool phrase;
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() == 0){
            this.isLanded = true;
        };
    };
    
    public void registerTower (WeatherTower weatherTower) {
            this.weatherTower = weatherTower;
            this.weatherTower.towerSays("JetPlane", this.name, this.id);
    };

    public boolean getLanded(){
        return this.isLanded;
    }
}