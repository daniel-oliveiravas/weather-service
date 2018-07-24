package com.demo.weatherservice.models.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class MetereologicalDetails {

    @JsonProperty("temp")
    private BigDecimal temperatute;

    @JsonProperty("pressure")
    private BigDecimal pressure;

    public BigDecimal getTemperatute() {
        return temperatute;
    }

    public void setTemperatute(BigDecimal temperatute) {
        this.temperatute = temperatute;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }
}