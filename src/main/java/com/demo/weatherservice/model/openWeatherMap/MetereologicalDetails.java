package com.demo.weatherservice.model.openWeatherMap;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class MetereologicalDetails {

    @SerializedName("temp")
    private BigDecimal temperatute;

    @SerializedName("pressure")
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