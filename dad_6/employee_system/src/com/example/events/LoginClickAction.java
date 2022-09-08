package com.example.events;

import com.example.gui.AdminWindow;
import com.example.logic.LoginCheck;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginClickAction implements ActionListener {
    private JTextField textUser;
    private JPasswordField textPassword;
    private JFrame loginFrame;

    public LoginClickAction(JTextField textUser, JPasswordField textPassword, JFrame loginFrame) {
        this.textUser = textUser;
        this.textPassword = textPassword;
        this.loginFrame = loginFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textUser.getText();
        String password = String.valueOf(textPassword.getPassword());

        if(LoginCheck.for_data(username, password)) {
            AdminWindow adminWindow = new AdminWindow();
            loginFrame.dispose();
            adminWindow.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(loginFrame,
                    "Login parameters invalid!","Login Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
