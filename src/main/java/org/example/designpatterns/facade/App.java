package org.example.designpatterns.facade;

import org.example.designpatterns.facade.WeatherForecastImpl.CityForecast;
import org.example.designpatterns.facade.WeatherForecastImpl.CurrentWeather;
import org.example.designpatterns.facade.WeatherForecastImpl.MainTempInfo;
import org.example.designpatterns.facade.WeatherForecastImpl.Wind;

import java.util.Scanner;

public class App {

    private final View view;
    private final WeatherForecast forecast;

    public App(View view, WeatherForecast forecast) {
        this.view = view;
        this.forecast = forecast;
    }

    public void run() {
        System.out.println(view.welcomeMsg());

        var scanner = new Scanner(System.in);
        String action = "";

        do {
            System.out.println(view.menuOptions());
            action = scanner.nextLine();

            if (action.equalsIgnoreCase("f")) {
                handleForecastRequest(scanner);
            } else if (!action.equalsIgnoreCase("x")) {
                System.out.println(view.actionNotAllowed());
            }
        } while (!action.equalsIgnoreCase("x"));

        scanner.close();
        System.out.println(view.goodbyeMsg());
    }

    private void handleForecastRequest(Scanner scanner) {
        System.out.println(view.cityRequest());

        var city = scanner.nextLine().trim();
        var capitalizedCity = city.substring(0, 1).toUpperCase() + city.substring(1);

        var cityForecast = forecast.findByCityName(capitalizedCity).orElse(nullCityForecast());
        System.out.println(view.forecastSummary(cityForecast));
    }

    private CityForecast nullCityForecast() {
        return new CityForecast(
                "N/A",
                "N/A",
                0.0,
                0.0,
                new CurrentWeather(
                        new MainTempInfo(0.0, 0.0, 0.0),
                        new Wind(0.0)
                )
        );
    }
}
