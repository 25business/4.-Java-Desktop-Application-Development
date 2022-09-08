package com.example.gui;

import com.example.gui.panels.AllEmployeesPanel;

import javax.swing.*;
import java.awt.*;

public class AdminWindow extends JFrame {
    public static JPanel mainPanel;

    public AdminWindow() {
        super();
        this.setTitle("Admin panel");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setJMenuBar(new AdminNavigationBar());
        mainPanel = new AllEmployeesPanel();
        this.add(mainPanel);
    }
}
