package fr.fortytwo.avajlauncher.vehicules;

abstract class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;    //avoir ici une variable partagée par toutes les instances de Aircraft

    protected Aircraft(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
    } 

    private long nextId() {};    
}