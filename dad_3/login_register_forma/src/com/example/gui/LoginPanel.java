package com.example.gui;

import javax.swing.*;

public class LoginPanel extends JPanel {

    public LoginPanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        LoginFieldContainer container_username = new LoginFieldContainer("Username:", "textfield", "");
        LoginFieldContainer container_password = new LoginFieldContainer("Password:", "password", "");
        LoginFieldContainer container_login_btn = new LoginFieldContainer("", "button", "Login");
        LoginFieldContainer container_register_forget = new LoginFieldContainer("", "register_forget", "");
        this.add(container_username);
        this.add(container_password);
        this.add(container_login_btn);
        this.add(container_register_forget);
    }

}
