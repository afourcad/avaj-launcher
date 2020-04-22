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

    public void updateCoordinates(int longitude, int latitude, int height) {
        setLongitude(this.longitude + longitude);
        setLatitude(this.latitude + latitude);
        setHeight(this.height + height);
    }

    public void setLongitude(int longitude) {
        this.longitude = Math.max(longitude, 0);
    }

    public int getLongitude() {
        return this.longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = Math.max(latitude, 0);
    }

    public int getLatitude() {
        return this.latitude;
    }

    public void setHeight(int height) {
        this.height = getRangedHeight(height);
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