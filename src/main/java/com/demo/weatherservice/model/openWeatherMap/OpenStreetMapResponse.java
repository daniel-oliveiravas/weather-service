package com.demo.weatherservice.model.openWeatherMap;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OpenStreetMapResponse {

    @SerializedName("main")
    private MetereologicalDetails metereologicalDetails;

    @SerializedName("weather")
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