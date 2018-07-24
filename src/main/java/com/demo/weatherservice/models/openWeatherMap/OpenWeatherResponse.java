package com.demo.weatherservice.models.openWeatherMap;

import com.demo.weatherservice.models.SimpleWeatherInformation;
import com.demo.weatherservice.models.interfaces.ResponseObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class OpenWeatherResponse implements ResponseObject {

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

  public SimpleWeatherInformation convert() {
    Weather firstWeather = weathers.stream().findFirst().orElse(new Weather());
    return new SimpleWeatherInformation(
        firstWeather.getShortDescription(),
        firstWeather.getFullDescription(),
        getMetereologicalDetails().getTemperatute(),
        getMetereologicalDetails().getPressure());
  }
}