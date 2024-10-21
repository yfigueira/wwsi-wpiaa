package org.example.designpatterns.facade.WeatherForecastImpl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.dotenv.Dotenv;
import org.example.designpatterns.facade.WeatherForecast;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class WeatherForecastAPI implements WeatherForecast {

    private static final String API_BASE_URL = "https://api.openweathermap.org";

    private final ObjectMapper mapper;
    private final Dotenv dotenv;

    public WeatherForecastAPI() {
        this.mapper = new ObjectMapper();
        this.dotenv = Dotenv.configure().load();
    }

    @Override
    public Optional<CityForecast> findByCityName(String name) {
        try {
            var cityForecast = fetchCity(name);
            return Optional.of(fetchCurrentWeather(cityForecast));
        } catch (IOException | NoSuchElementException e) {
            return Optional.empty();
        }
    }

    private CityForecast fetchCity(String city) throws IOException {
        var sourceUrl =
                URI.create("%s/geo/1.0/direct?q=%s&limit=1&appid=%s".formatted(
                        API_BASE_URL,
                        city,
                        dotenv.get("OPEN_WEATHER_API_KEY"))).toURL();

        var result = mapper.readValue(sourceUrl, new TypeReference<List<CityForecast>>() {});
        return result.getFirst();
    }

    private CityForecast fetchCurrentWeather(CityForecast cityForecast) throws IOException {
        var sourceUrl =
                URI.create("%s/data/2.5/weather?lat=%f&lon=%f&appid=%s&units=metric".formatted(
                        API_BASE_URL,
                        cityForecast.getLat(),
                        cityForecast.getLon(),
                        dotenv.get("OPEN_WEATHER_API_KEY"))).toURL();

        CurrentWeather currentWeather = mapper.readValue(sourceUrl, CurrentWeather.class);
        cityForecast.setCurrentWeather(currentWeather);
        return cityForecast;
    }
}
