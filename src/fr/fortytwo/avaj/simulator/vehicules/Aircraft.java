package fr.fortytwo.avaj.simulator.vehicules;

import fr.fortytwo.avaj.weather.Coordinates;

public abstract class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;    //avoir ici une variable partagée par toutes les instances de Aircraft

    protected Aircraft(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
    } 

    private long nextId() {return ++idCounter; };    
}