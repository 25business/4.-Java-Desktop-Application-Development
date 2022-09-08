package com.example;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherApi {
    private OkHttpClient client;
    private Request request;
    private Gson gson;

    public WeatherApi() {
        client = new OkHttpClient();
        gson = new Gson();
        request = new Request.Builder().url("https://goweather.herokuapp.com/weather/Belgrade").build();
    }

    public void createRequest(String city_name) {
        request = new Request.Builder().url("https://goweather.herokuapp.com/weather/" + city_name).build();
    }

    public WeatherData getResponse() throws IOException {
        Response response = client.newCall(request).execute();
        return gson.fromJson(response.body().string(), WeatherData.class);
    }
}
