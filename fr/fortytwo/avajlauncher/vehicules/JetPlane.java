package fr.fortytwo.avajlauncher.vehicules;

class JetPlane extends Aircraft {
    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates Coordinates) {
        //super(name, coordinates), un truc dans le genre
    }

    public void updateConditions() {};
    
    public void registerTower(WeatherTower weatherTower) {};
}