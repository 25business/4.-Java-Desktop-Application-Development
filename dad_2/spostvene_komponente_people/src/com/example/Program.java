package com.example;

import com.example.gui.MainWindow;
import com.example.gui.MainWindowInitializer;

public class Program {
    public static void main(String[] args) {
        MainWindow window = MainWindowInitializer.pack();
        window.setVisible(true);
    }
}
