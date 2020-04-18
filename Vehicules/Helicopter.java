class Helicopter extends Aircraft {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates Coordinates) {
        //super(name, coordinates), un truc dans le genre
    }

    public void updateConditions() {};
    
    public void registerTower(WeatherTower weatherTower) {};
}