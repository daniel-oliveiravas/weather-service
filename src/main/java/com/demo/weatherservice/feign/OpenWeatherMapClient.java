package com.demo.weatherservice.feign;

import com.demo.weatherservice.model.openWeatherMap.OpenStreetMapResponse;
import feign.Param;
import feign.RequestLine;

public interface OpenWeatherMapClient {

    @RequestLine("GET /weather?q={city}&appid=a6fc39296f8df7e2a1ac6e70a0d60a3e")
    OpenStreetMapResponse getWeather(@Param("city") String city);
}
