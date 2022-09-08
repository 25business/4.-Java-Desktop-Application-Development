package com.example;

public class WeatherData {
    private String temperature;
    private String wind;
    private String description;
    private Object[] forecast;

    public WeatherData(){}

    public WeatherData(String temperature, String wind, String description, Object[] forecast) {
        this.temperature = temperature;
        this.wind = wind;
        this.description = description;
        this.forecast = forecast;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object[] getForecast() {
        return forecast;
    }

    public void setForecast(Object[] forecast) {
        this.forecast = forecast;
    }
}
