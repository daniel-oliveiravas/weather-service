package com.demo.weatherservice.feign;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenWeatherMapAuthorizationConfig {

  @Value("${openWeatherMap.api-key}")
  private String openWeatherApiKey;
  private static final String AUTHORIZATION_PARAM = "appId";

  @Bean
  RequestInterceptor openWeatherMapClientInterceptor() {
    return template -> template.query(AUTHORIZATION_PARAM, openWeatherApiKey);
  }
}
