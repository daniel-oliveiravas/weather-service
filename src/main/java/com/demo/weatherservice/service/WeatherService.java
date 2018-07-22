package com.demo.weatherservice.service;

import com.demo.weatherservice.feign.OpenWeatherMapClient;
import com.demo.weatherservice.model.openWeatherMap.OpenStreetMapResponse;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final OpenWeatherMapClient openWeatherClient;

    public WeatherService(OpenWeatherMapClient openWeatherClient) {
        this.openWeatherClient = openWeatherClient;
    }

    public OpenStreetMapResponse getWeather(String city) {
        return openWeatherClient.getWeather(city);
    }
}