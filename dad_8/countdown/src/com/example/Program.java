package com.example;

import javax.swing.*;

public class Program {
    public static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(200, 300);

        JLabel label_secondstext = new JLabel("Seconds");
        JLabel label_countdown = new JLabel("-");
        JTextField text_seconds = new JTextField();
        JButton button_countdown = new JButton("Countdown");

        button_countdown.addActionListener( actionEvent -> {
            Countdown countdown = new Countdown();
            countdown.setCountdown(text_seconds.getText());
            timer = new Timer(1000, new CountdownAction(timer,
                    label_countdown, countdown));
            timer.start();
        });

        frame.add(label_secondstext);
        frame.add(text_seconds);
        frame.add(label_countdown);
        frame.add(button_countdown);

        frame.setVisible(true);
    }
}
