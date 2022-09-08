package com.example;

import javax.swing.*;
import java.awt.*;

public class WeatherFrame extends JFrame {

    public WeatherFrame() {
        this.setTitle("Current Weather");
        this.setSize(400, 300);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        WeatherApi api_client = new WeatherApi();

        JPanel search_city_panel = new JPanel();
        search_city_panel.setLayout(new FlowLayout());
        JTextField text_city = new JTextField("Belgrade");
        JButton button_weather = new JButton("Display");
        search_city_panel.add(text_city);
        search_city_panel.add(button_weather);

        JPanel temperature_panel = new JPanel();
        temperature_panel.setLayout(new GridLayout(0,2));

        JLabel label_temptext = new JLabel("Temperature:");
        temperature_panel.add(label_temptext);
        JLabel label_temperature = new JLabel("-");
        temperature_panel.add(label_temperature);
        JLabel label_windtext = new JLabel("Wind:");
        temperature_panel.add(label_windtext);
        JLabel label_wind = new JLabel("-");
        temperature_panel.add(label_wind);
        JLabel label_desctext = new JLabel("Description");
        temperature_panel.add(label_desctext);
        JLabel label_description = new JLabel("-");
        temperature_panel.add(label_description);

        button_weather.addActionListener(actionEvent -> {
            api_client.createRequest(text_city.getText());
            try {
                WeatherData data = api_client.getResponse();
                label_temperature.setText(data.getTemperature());
                label_wind.setText(data.getWind());
                label_description.setText(data.getDescription());
            }catch (Exception ex) { ex.printStackTrace(); }
        });

        Timer timer = new Timer(5000, timerEvent -> {
            try {
                WeatherData data = api_client.getResponse();
                label_temperature.setText(data.getTemperature());
                label_wind.setText(data.getWind());
                label_description.setText(data.getDescription());
            }catch (Exception ex) { ex.printStackTrace(); }
        });
        timer.start();

        this.add(search_city_panel, BorderLayout.PAGE_START);
        this.add(temperature_panel, BorderLayout.CENTER);
    }
}
