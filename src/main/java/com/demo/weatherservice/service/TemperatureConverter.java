package com.demo.weatherservice.service;

public class TemperatureConverter {

  public static Double convertKelvinsToCelsiues(Double temperatureInKelvins) {
    return temperatureInKelvins - 273.15;
  }
}
