package com.demo.weatherservice.model.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OpenStreetMapResponse {

    @JsonProperty("main")
    private MetereologicalDetails metereologicalDetails;

    @JsonProperty("weather")
    private List<WeatherInformation> weatherInformations;

    public MetereologicalDetails getMetereologicalDetails() {
        return metereologicalDetails;
    }

    public void setMetereologicalDetails(MetereologicalDetails metereologicalDetails) {
        this.metereologicalDetails = metereologicalDetails;
    }

    public List<WeatherInformation> getWeatherInformations() {
        return weatherInformations;
    }

    public void setWeatherInformations(List<WeatherInformation> weatherInformations) {
        this.weatherInformations = weatherInformations;
    }
}