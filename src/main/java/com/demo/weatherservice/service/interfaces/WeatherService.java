package com.demo.weatherservice.service.interfaces;

import com.demo.weatherservice.models.SimpleWeatherInformation;

public interface WeatherService {

  SimpleWeatherInformation getWeather(String city);
}
