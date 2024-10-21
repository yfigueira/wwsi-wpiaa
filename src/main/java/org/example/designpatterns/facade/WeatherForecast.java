package org.example.designpatterns.facade;

import org.example.designpatterns.facade.WeatherForecastImpl.CityForecast;

import java.util.Optional;

public interface WeatherForecast {

    Optional<CityForecast> findByCityName(String city);
}
