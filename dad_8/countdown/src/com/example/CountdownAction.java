package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountdownAction implements ActionListener {
    private Timer timer;
    private JLabel label_countdown;
    private Countdown countdown;

    public CountdownAction(Timer t, JLabel lc, Countdown c) {
        timer = t;
        label_countdown = lc;
        countdown = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(countdown.isZero()) { timer.stop(); }
        countdown.decrement();
        label_countdown.setText(String.valueOf(countdown.getCountdown()));
    }
}
