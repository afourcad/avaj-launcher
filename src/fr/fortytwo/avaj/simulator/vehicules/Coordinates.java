package fr.fortytwo.avaj.simulator.vehicules;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {
        this.longitude = Math.max(longitude, 0);
        this.latitude = Math.max(latitude, 0);
        this.height = getRangedHeight(height);
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLongitude() {
        return this.longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    private int getRangedHeight(int height) {
        if (height <= 0) {
            return 0;
        }
        else {
            return Math.min(height, 100);
        }
    }
}