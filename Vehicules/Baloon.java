class Baloon extends Aircraft {
    private WeatherTower weatherTower;

    Baloon(String name, Coordinates Coordinates) {
        //super(name, coordinates), un truc dans le genre
    }

    public void updateConditions() {};
    
    public void registerTower(WeatherTower weatherTower) {};
}