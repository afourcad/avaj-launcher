package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.Logger;
import fr.fortytwo.avaj.simulator.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch (weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                this.coordinates.updateCoordinates(10, 0, 2);
                setUpdateMessage("Ho god we have a big fan up here. this is great");
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(5, 0, 0);
                setUpdateMessage("Theses rotors are like umbrella !");
                break;
            case "FOG":
                this.coordinates.updateCoordinates(1, 0, 0);
                setUpdateMessage("I don't know if rotors are good for this case");
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -12);
                setUpdateMessage("My rotors are freezing go down !");
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() == 0) {
            this.isLanded = true;
        }
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.towerSays("Helicopter", this.name, this.id);

    }

    public boolean getLanded() {
        return this.isLanded;
    }

    private void setUpdateMessage(String message) {
        Logger.setNewLog("Helicopter#" + this.name + "(" + this.id + "):" + message);
    }
}