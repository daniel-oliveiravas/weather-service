package com.demo.weatherservice.models.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetereologicalDetails {

  @JsonProperty("temp")
  private Double temperatute;

  @JsonProperty("pressure")
  private Double pressure;

  public MetereologicalDetails() {
  }

  public MetereologicalDetails(Double temperatute, Double pressure) {
    this.temperatute = temperatute;
    this.pressure = pressure;
  }

  public Double getTemperatute() {
    return temperatute;
  }

  public void setTemperatute(Double temperatute) {
    this.temperatute = temperatute;
  }

  public Double getPressure() {
    return pressure;
  }

  public void setPressure(Double pressure) {
    this.pressure = pressure;
  }
}