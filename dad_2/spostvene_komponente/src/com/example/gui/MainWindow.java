package com.example.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        super();
        this.setTitle("Moj modifikovani prozor");
        this.setSize(300, 300);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }
}
