package org.example.designpatterns.facade;

import org.example.designpatterns.facade.WeatherForecastImpl.CityForecast;

public class View {

    public String welcomeMsg() {
        return """
                ************************************************
                           Welcome to Weather Forecast
                ************************************************
                """;
    }

    public String menuOptions() {
        return """
                Select action:
                 --> (f) forecast
                 --> (x) exit
                """;
    }

    public String actionNotAllowed() {
        return """
                --- Action not allowed ---
                """;
    }

    public String cityRequest() {
        return """
                --- City:
                """;
    }

    public String forecastSummary(CityForecast forecast) {
        return """
                ------------------------------------------------
                City: %s
                Country: %s
                Coordinates: { lat: %f, lon: %f }
                ------------------------------------------------
                Current weather:
                --- temperature: %.2f C
                --- pressure: %.2f hPa
                --- humidity: %.2f %%
                --- wind speed: %.2f m/s
                ------------------------------------------------
                """
                .formatted(
                    forecast.getName(),
                    forecast.getCountry(),
                    forecast.getLat(),
                    forecast.getLon(),
                    forecast.getCurrentWeather().getMain().getTemp(),
                    forecast.getCurrentWeather().getMain().getPressure(),
                    forecast.getCurrentWeather().getMain().getHumidity(),
                    forecast.getCurrentWeather().getWind().getSpeed()
        );
    }

    public String goodbyeMsg() {
        return """
                ************************************************
                                  See you soon!
                ************************************************
                """;
    }
}
