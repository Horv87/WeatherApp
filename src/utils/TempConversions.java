package utils;

/**
 * Created by martin on 14.12.16.
 */
public class TempConversions {


    public static final double KELVIN_CEL_DIFFERENCE = 273.15;
    public static final double KELVIN_FAHR_DIFFERENCE = 459.67;

    public static double kelvinToCel (double kelvin) {
        return kelvin - KELVIN_CEL_DIFFERENCE;
    }

    public static double kelvinToFahrenheit (double kelvin){
        return (kelvin * 9/5) - KELVIN_FAHR_DIFFERENCE;
    }

    public static double celToKelvin (double cel){
        return cel+ KELVIN_CEL_DIFFERENCE;
    }
}
