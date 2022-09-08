package com.example.gui;

import javax.swing.*;
import java.awt.*;

public class BlueButton extends JButton {

    public BlueButton(String button_text) {
        super(button_text);
        this.setBackground(new Color(11, 46, 125));
        this.setForeground(Color.WHITE);
        this.setFocusable(false);
        this.setFont(new Font("Arial", Font.PLAIN, 16));
    }
}
