package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.simulator.Logger;
import fr.fortytwo.avaj.simulator.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private boolean isLanded = false;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        switch (weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                this.coordinates.updateCoordinates(0, 10, 2);
                setUpdateMessage("We are suffocating in this box !");
                break;
            case "RAIN":
                this.coordinates.updateCoordinates(0, 5, 0);
                setUpdateMessage("I'm not soaked haha, you do ?");
                break;
            case "FOG":
                this.coordinates.updateCoordinates(0, 1, 0);
                setUpdateMessage("I don't know where I go but I go straight there");
                break;
            case "SNOW":
                this.coordinates.updateCoordinates(0, 0, -7);
                setUpdateMessage("Ho look down. this is snow on earth");
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
        this.weatherTower.towerSays("JetPlane", this.name, this.id);
    }

    public boolean getLanded() {
        return this.isLanded;
    }

    private void setUpdateMessage(String message) {
        Logger.setNewLog("JetPlane#" + this.name + "(" + this.id + "):" + message);
    }
}