package com.demo.weatherservice.model.openWeatherMap;

import com.google.gson.annotations.SerializedName;

public class WeatherInformation {

    @SerializedName("main")
    private String title;

    @SerializedName("description")
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
