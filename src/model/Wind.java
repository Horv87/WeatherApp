package model;

/**
 * Created by martin on 14.12.16.
 */
public class Wind {

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    private float speed;
    private float deg;

    public Wind (float speed, float deg){

        this.speed = speed;
        this.deg = deg;
    }


}
