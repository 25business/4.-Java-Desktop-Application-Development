package com.example;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ElapsedTime elapsedTime = new ElapsedTime();

        frame.setTitle("Stoperica");
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel label_stopwatch = new JLabel("00:00.00");
        frame.add(label_stopwatch);

        Timer timer = new Timer(100, actionEvent -> {
            elapsedTime.incrementTenths();
            label_stopwatch.setText(String.valueOf(elapsedTime));
        });

        JPanel panel_buttons = new JPanel();
        panel_buttons.setLayout(new FlowLayout());

        JButton button_start = new JButton("Start");
        button_start.setBackground(Color.GREEN);
        button_start.setForeground(Color.WHITE);
        button_start.addActionListener(actionEvent -> {
            timer.start();
        });

        JButton button_stop = new JButton("Stop");
        button_stop.setBackground(Color.RED);
        button_stop.setForeground(Color.WHITE);
        button_stop.addActionListener(actionEvent -> {
            timer.stop();
        });
        panel_buttons.add(button_start);
        panel_buttons.add(button_stop);
        frame.add(panel_buttons);

        frame.setVisible(true);
    }
}
