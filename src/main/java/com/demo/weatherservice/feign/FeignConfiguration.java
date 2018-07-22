package com.demo.weatherservice.feign;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean(name = "openWeatherMapClient")
    public OpenWeatherMapClient openWeatherMapClient(@Value("${openWeatherMap.url}") String url) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .client(new OkHttpClient())
                .logger(new Logger.JavaLogger().appendToFile("http.log"))
                .target(OpenWeatherMapClient.class, url);
    }
}
