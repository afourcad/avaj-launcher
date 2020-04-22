package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch(weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                this.coordinates.updateCoordinates(10, 0, 2);
                //TODO: cool phrase;
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(5, 0, 0);
                //TODO: cool phrase;
                break;
            case "FOG":
                this.coordinates.updateCoordinates(1, 0, 0);
                //TODO: cool phrase;
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -12);
                //TODO: cool phrase;
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() == 0){
            this.isLanded = true;
        };
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.towerSays("Helicopter", this.name, this.id);

    };

    public boolean getLanded(){
        return this.isLanded;
    }
}