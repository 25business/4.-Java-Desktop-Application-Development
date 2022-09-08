package com.example.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginFieldContainer extends JPanel {
    private JLabel label;
    private JComponent field;

    public LoginFieldContainer(String label_text, String field_type, String field_text) {
        super();
        this.setLayout(new GridLayout(1,2, 10, 0));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 40));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        this.setPreferredSize(new Dimension(Integer.MAX_VALUE, 40));
        this.setBorder(new EmptyBorder(10,10,10,10));

        this.label = new JLabel(label_text);
        this.field = switch (field_type) {
            case "password" -> new JPasswordField(field_text);
            case "button" -> new JButton(field_text);
            case "register_forget" -> new RegisterForgetPasswordContainer();
            default -> new JTextField(field_text);
        };
        this.add(label);
        this.add(field);
    }
}
