package org.example.designpatterns.facade.WeatherForecastImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityForecast {

    private String name;
    private String country;
    private double lat;
    private double lon;
    private CurrentWeather currentWeather;

    public CityForecast(String name, String country, double lat, double lon, CurrentWeather currentWeather) {
        this.name = name;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.currentWeather = currentWeather;
    }

    public CityForecast() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }
}
