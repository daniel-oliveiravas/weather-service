package com.demo.weatherservice.model.openWeatherMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInformation {

    @JsonProperty("main")
    private String title;

    @JsonProperty("description")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
