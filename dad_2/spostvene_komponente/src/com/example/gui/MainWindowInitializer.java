package com.example.gui;

import javax.swing.*;

public class MainWindowInitializer {

    public static MainWindow pack() {
        MainWindow window = new MainWindow();
        DarkGreyTextField text_x = new DarkGreyTextField();
        DarkGreyTextField text_y = new DarkGreyTextField();
        text_x.setBounds(10, 10, 50, 25);
        text_y.setBounds(70, 10, 50, 25);
        window.add(text_x);
        window.add(text_y);
        return window;
    }
}
