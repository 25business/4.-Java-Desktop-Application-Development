package com.example.gui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class DarkGreyTextField extends JTextField {

    public DarkGreyTextField() {
        this.setBackground(new Color(40, 40, 40));
        this.setForeground(Color.WHITE);
        this.setBorder(new BasicBorders.FieldBorder(Color.DARK_GRAY,
                Color.BLACK, Color.BLUE, Color.LIGHT_GRAY));
    }
}
