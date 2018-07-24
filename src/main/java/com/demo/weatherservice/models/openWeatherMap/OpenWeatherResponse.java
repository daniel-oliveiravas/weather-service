package com.demo.weatherservice.models.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OpenWeatherResponse {

    @JsonProperty("main")
    private MetereologicalDetails metereologicalDetails;

    @JsonProperty("weather")
    private List<Weather> weathers;

    public MetereologicalDetails getMetereologicalDetails() {
        return metereologicalDetails;
    }

    public void setMetereologicalDetails(MetereologicalDetails metereologicalDetails) {
        this.metereologicalDetails = metereologicalDetails;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }
}