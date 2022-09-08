package com.example;

import com.example.gui.ForgotPasswordPanel;
import com.example.gui.LoginPanel;
import com.example.gui.RegisterPanel;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static CardLayout MAIN_CARD_LAYOUT;
    public static Container MAIN_CONTAINER;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        MAIN_CARD_LAYOUT = new CardLayout();
        MAIN_CONTAINER = frame.getContentPane();
        frame.setLayout(MAIN_CARD_LAYOUT);
        frame.add(new LoginPanel(), "LOGIN");
        frame.add(new RegisterPanel(), "REGISTER");
        frame.add(new ForgotPasswordPanel(), "FORGOT");

        frame.setVisible(true);
    }
}
