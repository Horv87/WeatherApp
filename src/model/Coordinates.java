package model;


public class Coordinates {


    private float lon;
    private float lat;


    public Coordinates (float lon, float lat){
        this.lat = lat;
        this.lon = lon;

    }


    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

}
