package com.example.gui;

import javax.swing.*;
import java.awt.*;

public class RegisterForgetPasswordContainer extends JPanel {
    private JLabel register_label;
    private JLabel forgot_label;

    public RegisterForgetPasswordContainer() {
        super();
        this.setLayout(new GridLayout(1,2, 30, 0));
        register_label = new JLabel("Register?");
        register_label.setForeground(Color.BLUE);
        register_label.addMouseListener(new RegisterClickListener());
        this.add(register_label);

        forgot_label = new JLabel("Forgot password?");
        forgot_label.setForeground(Color.BLUE);
        forgot_label.addMouseListener(new ForgotClickListener());
        this.add(forgot_label);
    }
}
