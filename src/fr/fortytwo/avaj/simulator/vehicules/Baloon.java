package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch(weatherTower.getWeather(this.coordinates)){
            case "SUN":
                this.coordinates.updateCoordinates(2, 0, 4);
                //TODO: cool phrase;
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(0, 0, -5);
                //TODO: cool phrase;
                break;
            case "FOG":
                this.coordinates.updateCoordinates(0, 0, -3);
                //TODO: cool phrase;
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -15);
                //TODO: cool phrase;
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() == 0){
            this.isLanded = true;
        };
    };
    
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.towerSays("Baloon", this.name, this.id);
    };

    public boolean getLanded(){
        return this.isLanded;
    }
}