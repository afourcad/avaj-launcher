package fr.fortytwo.avaj.simulator.vehicules;

public abstract class AircraftFactory {
    public static Flyable newAircraft(
            String type,
            String name,
            int longitude,
            int latitude,
            int height
        ){
            Class fyable = Class.forName(type);
            return fyable.newInstance(name, longitude, latitude, height);
        };
}