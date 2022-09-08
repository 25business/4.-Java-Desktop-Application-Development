package com.example.gui;

import com.example.events.LoginClickAction;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class LoginWindow extends JFrame {

    public LoginWindow() {
        super();
        this.setTitle("Employee System");
        this.setSize(new Dimension(600, 400));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridBagLayout());
        loginPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.setPreferredSize(new Dimension(300, 130));
        loginPanel.setMaximumSize(new Dimension(300, 130));


        JLabel labelUser = new JLabel();
        JLabel labelPassword = new JLabel();
        JTextField textUser = new JTextField();
        JPasswordField textPassword = new JPasswordField();
        JButton buttonLogin = new JButton("Login");
        buttonLogin.addActionListener(new LoginClickAction(textUser,textPassword, this));

        try {
            InputStream userIconStream = LoginWindow.class.getResourceAsStream("icons/user_icon.png");
            InputStream passwordIconStream = LoginWindow.class.getResourceAsStream("icons/password_icon.png");
            BufferedImage userIconBuffer = ImageIO.read(userIconStream);
            BufferedImage passwordIconBuffer = ImageIO.read(passwordIconStream);
            labelUser.setIcon(new ImageIcon(userIconBuffer));
            labelPassword.setIcon(new ImageIcon(passwordIconBuffer));
        } catch (Exception ex) { ex.printStackTrace(); }

        GridBagConstraints c_l_u = new GridBagConstraints();
        c_l_u.gridx = 0; c_l_u.gridy = 0;
        GridBagConstraints c_l_p = new GridBagConstraints();
        c_l_p.gridx = 0; c_l_p.gridy = 1;
        GridBagConstraints c_t_u = new GridBagConstraints();
        c_t_u.gridx = 1; c_t_u.gridy = 0;
        GridBagConstraints c_t_p = new GridBagConstraints();
        c_t_p.gridx = 1; c_t_p.gridy = 1;
        GridBagConstraints c_b_l = new GridBagConstraints();
        c_b_l.gridx = 1; c_b_l.gridy = 2;
        labelUser.setPreferredSize(new Dimension(24,24));
        labelPassword.setPreferredSize(new Dimension(24,24));
        labelUser.setMaximumSize(new Dimension(24,24));
        labelPassword.setMaximumSize(new Dimension(24,24));
        textUser.setPreferredSize(new Dimension(200,24));
        textUser.setMaximumSize(new Dimension(200,24));
        textPassword.setPreferredSize(new Dimension(200,24));
        textPassword.setMaximumSize(new Dimension(200,24));
        buttonLogin.setPreferredSize(new Dimension(100,24));
        buttonLogin.setMaximumSize(new Dimension(100,24));

        loginPanel.add(labelUser, c_l_u);
        loginPanel.add(textUser, c_t_u);
        loginPanel.add(labelPassword, c_l_p);
        loginPanel.add(textPassword, c_t_p);
        loginPanel.add(buttonLogin,c_b_l);

        this.add(Box.createVerticalGlue());
        this.add(loginPanel);
        this.add(Box.createVerticalGlue());
    }
}
