package com.demo.weatherservice.service.interfaces;

import com.demo.weatherservice.models.openWeatherMap.OpenWeatherResponse;

public interface WeatherService {

  OpenWeatherResponse getWeather(String city);
}
