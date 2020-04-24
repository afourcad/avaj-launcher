package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.Logger;
import fr.fortytwo.avaj.simulator.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch (weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                this.coordinates.updateCoordinates(2, 0, 4);
                setUpdateMessage("Ho god this is so hot thanksfully we don't have windows !");
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(0, 0, -5);
                setUpdateMessage("I wish I could have windows with this bloody rain  !");
                break;
            case "FOG":
                this.coordinates.updateCoordinates(0, 0, -3);
                setUpdateMessage("Do we have windows ?");
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -15);
                setUpdateMessage("Thanksfully we have fire up here !");
                break;
            default:
                break;
        }
        if (this.coordinates.getHeight() == 0) {
            this.isLanded = true;
            setUpdateMessage("Landing !");
        }
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        this.weatherTower.towerSays("Baloon", this.name, this.id);
    }

    public boolean getLanded() {
        return this.isLanded;
    }

    private void setUpdateMessage(String message) {
        Logger.setNewLog("Baloon#" + this.name + "(" + this.id + "): " + message);
    }
}