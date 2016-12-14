package model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by martin on 14.12.16.
 */
public class WeatherModel {
    @SerializedName("coord")
    private Coordinates coord;
    @SerializedName("main")
    private WeatherMain main;

    private Weather[] weather;
    private String base;

    private int visibility;
    private Wind wind;

    private Clouds clouds;

    private String dt;
    private int id;
    private String name;
    private int cod;

    public WeatherModel(Coordinates coord, WeatherMain main, Weather[] weather, String base, int visibility, Wind wind, Clouds clouds, String dt, int id, String name, int cod){
        this.coord = coord;
        this.main = main;
        this.weather = weather;
        this.base = base;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather weather[]) {
        this.weather = weather;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }

    private Sys sys;


}
