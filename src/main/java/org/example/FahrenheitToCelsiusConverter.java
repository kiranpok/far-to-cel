package org.example;

public class FahrenheitToCelsiusConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvinToCel(float kel) {
        return (float) (kel - 273.15);
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6; // Change this value to test different temperatures
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        float kelvin = 273.15f; // Change this value to test different temperatures in Kelvin
        float celsiusFromKelvin = kelvinToCel(kelvin);
        System.out.println(kelvin + " Kelvin is equal to " + celsiusFromKelvin + " Celsius.");
    }
}




