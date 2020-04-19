package fr.fortytwo.avaj.weather;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static final String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider(){};
    
    public static WeatherProvider getProvider() { return weatherProvider; };

    public String getCurrentWeather(Coordinates coordinates) {}
}