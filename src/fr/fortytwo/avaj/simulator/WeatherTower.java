package fr.fortytwo.avaj.simulator;

import fr.fortytwo.avaj.simulator.vehicules.Coordinates;
import fr.fortytwo.avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather() {
        this.conditionsChanged();
    }

    @Override
    public void towerSays(String type, String name, long id){
        Logger.setNewLog("Tower says: " + type + "#" + name + "(" + id + ")" + " registered to weather tower");
    }
}