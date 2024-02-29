package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FahrenheitToCelsiusConverterTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        double fahrenheit = 32;
        double expectedCelsius = 0;
        double resultCelsius = FahrenheitToCelsiusConverter.convertFahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, resultCelsius, 0.001); // Using delta for double comparison
    }

    @Test
    public void testConvertFahrenheitToCelsiusNegative() {
        double fahrenheit = -40;
        double expectedCelsius = -40;
        double resultCelsius = FahrenheitToCelsiusConverter.convertFahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, resultCelsius, 0.001); // Using delta for double comparison
    }

    @Test
    public void testConvertFahrenheitToCelsiusPositive() {
        double fahrenheit = 212;
        double expectedCelsius = 100;
        double resultCelsius = FahrenheitToCelsiusConverter.convertFahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, resultCelsius, 0.001); // Using delta for double comparison
    }

    @Test
    public void testKelvinToCel() {
        float kelvin = 273.15f;
        float expectedCelsius = 0;
        float resultCelsius = FahrenheitToCelsiusConverter.kelvinToCel(kelvin);
        assertEquals(expectedCelsius, resultCelsius, 0.001); // Using delta for float comparison
}}



