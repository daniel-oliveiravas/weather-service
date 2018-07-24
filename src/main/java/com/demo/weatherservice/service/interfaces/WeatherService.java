package com.demo.weatherservice.service.interfaces;

import com.demo.weatherservice.models.openWeatherMap.OpenStreetMapResponse;

public interface WeatherService {

  OpenStreetMapResponse getWeather(String city);
}
