package com.demo.weatherservice.controller;

import com.demo.weatherservice.model.openWeatherMap.OpenStreetMapResponse;
import com.demo.weatherservice.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping("/weather")
    public ResponseEntity<OpenStreetMapResponse> getWeatherByCityName(@RequestParam String city) {
        return ResponseEntity.ok(weatherService.getWeather(city));
    }
}