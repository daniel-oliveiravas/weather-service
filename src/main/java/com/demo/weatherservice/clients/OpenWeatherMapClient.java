package com.demo.weatherservice.clients;

import com.demo.weatherservice.models.openWeatherMap.OpenStreetMapResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "open-weather-service",
    url = "${openWeatherMap.url}",
    configuration = OpenWeatherMapAuthorizationConfig.class
)
public interface OpenWeatherMapClient {

  @GetMapping("/weather?q={city}")
  OpenStreetMapResponse getWeather(@PathVariable("city") String city);
}
