package com.example;
import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Naslov");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        JLabel current_time_label = new JLabel(LocalTime.now().format(dtf));
        frame.add(current_time_label, BorderLayout.PAGE_START);

        Timer t = new Timer(1000, actionEvent -> {
            current_time_label.setForeground(Color.PINK);
            current_time_label.setText(LocalTime.now().format(dtf));
        });
        //t.setInitialDelay(0);
        //t.setRepeats(false);


        JButton btn_start = new JButton("Start");
        btn_start.addActionListener(actionEvent -> {
            t.start();
        });
        JButton btn_stop = new JButton("Stop");
        btn_stop.addActionListener(actionEvent -> {
            t.stop();
        });

        JPanel start_stop_panel = new JPanel();
        start_stop_panel.setLayout(new FlowLayout());
        start_stop_panel.add(btn_start);
        start_stop_panel.add(btn_stop);
        frame.add(start_stop_panel);

        frame.setVisible(true);

    }
}
