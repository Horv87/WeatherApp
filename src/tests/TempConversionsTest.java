package tests;

import utils.TempConversions;

import static org.junit.Assert.*;

/**
 * Created by martin on 14.12.16.
 */
public class TempConversionsTest {
    @org.junit.Test
    public void kelvinToCel() throws Exception {

        assertEquals(TempConversions.kelvinToCel(0),-273.15,0);
    }

    @org.junit.Test
    public void kelvinToFahrenheit() throws Exception {
        assertEquals(TempConversions.kelvinToFahrenheit(0),-459.67,0);
    }

    @org.junit.Test
    public void celToKelvin() throws Exception {
        assertEquals(TempConversions.celToKelvin(0),273.15,0);
    }

}