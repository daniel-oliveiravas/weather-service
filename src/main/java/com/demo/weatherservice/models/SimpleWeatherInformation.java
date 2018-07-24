package com.demo.weatherservice.models;


import com.demo.weatherservice.service.TemperatureConverter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.DecimalFormat;

public class SimpleWeatherInformation {

  @JsonProperty
  private String shortDescription;

  @JsonProperty
  private String fullDescription;

  @JsonProperty
  @JsonFormat
  private Double temperature;

  @JsonProperty
  private Double pressure;

  public SimpleWeatherInformation(String shortDescription, String fullDescription,
      Double temperature, Double pressure) {
    this.shortDescription = shortDescription;
    this.fullDescription = fullDescription;
    this.temperature = temperature;
    this.pressure = pressure;
  }

  public SimpleWeatherInformation() {
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getFullDescription() {
    return fullDescription;
  }

  public void setFullDescription(String fullDescription) {
    this.fullDescription = fullDescription;
  }

  public Double getTemperature() {
    return TemperatureConverter.convertKelvinsToCelsiues(temperature);
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public Double getPressure() {
    return pressure;
  }

  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }
}
