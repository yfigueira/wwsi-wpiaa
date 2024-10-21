package org.example.designpatterns.facade;

import org.example.designpatterns.facade.WeatherForecastImpl.WeatherForecastAPI;

public class Main {
    public static void main(String[] args) {

        var app = new App(new View(), new WeatherForecastAPI());
        app.run();
    }
}
