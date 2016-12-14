package model;

/**
 * Created by martin on 14.12.16.
 */
public class WeatherMain {


    private float temp;
    private int pressure;
    private int humidity;
    private float tempMin;
    private float tempMax;


    public WeatherMain (float temp, int pressure, int humidity, float tempMin, float tempMax){

        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }


    public float getTemp() {
        return temp;
    }


    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
}
