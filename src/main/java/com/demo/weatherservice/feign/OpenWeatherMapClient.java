package com.demo.weatherservice.feign;

import com.demo.weatherservice.model.openWeatherMap.OpenStreetMapResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "open-weather-service", url = "${openWeatherMap.url}")
public interface OpenWeatherMapClient {

    @GetMapping("/weather?q={city}&appid=a6fc39296f8df7e2a1ac6e70a0d60a3e")
    OpenStreetMapResponse getWeather(@PathVariable("city") String city);
}
