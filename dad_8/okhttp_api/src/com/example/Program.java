package com.example;

import okhttp3.*;

public class Program {
    public static void main(String[] args) {
        /*OkHttpClient client = new OkHttpClient();
        try {
            Request request = new Request.Builder().url("https://goweather.herokuapp.com/weather/Belgrade").build();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
        WeatherFrame weatherFrame = new WeatherFrame();
        weatherFrame.setVisible(true);
    }
}
