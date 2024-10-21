package org.example.designpatterns.facade.WeatherForecastImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWeather {

    private MainTempInfo main;
    private Wind wind;

    public CurrentWeather(MainTempInfo main, Wind wind) {
        this.main = main;
        this.wind = wind;
    }

    public CurrentWeather() {
    }

    public MainTempInfo getMain() {
        return main;
    }

    public void setMain(MainTempInfo main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
