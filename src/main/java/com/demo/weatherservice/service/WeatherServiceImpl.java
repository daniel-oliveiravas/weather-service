package com.demo.weatherservice.service;

import com.demo.weatherservice.clients.OpenWeatherMapClient;
import com.demo.weatherservice.models.openWeatherMap.OpenStreetMapResponse;
import com.demo.weatherservice.service.interfaces.WeatherService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final OpenWeatherMapClient openWeatherClient;

    public WeatherServiceImpl(OpenWeatherMapClient openWeatherClient) {
        this.openWeatherClient = openWeatherClient;
    }

    @Cacheable("weather")
    public OpenStreetMapResponse getWeather(String city) {
        return openWeatherClient.getWeather(city);
    }
}
