package com.example.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RegisterPanel extends JPanel {

    private void set_size(JComponent komponenta) {
        // Za emptyBorder na size morate dodati + 20 za top i bottom
        // jer border ulazi u velicinu elementa (windth, height)
        komponenta.setMinimumSize(new Dimension(Integer.MAX_VALUE, 40));
        komponenta.setPreferredSize(new Dimension(Integer.MAX_VALUE, 40));
        komponenta.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        //komponenta.setBorder(new EmptyBorder(10,10,10,10));
    }

    public RegisterPanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label_username = new JLabel("Username");
        set_size(label_username);
        this.add(label_username);
        JTextField txt_username = new JTextField();
        set_size(txt_username);
        this.add(txt_username);
        this.add(Box.createRigidArea(new Dimension(0, 30)));
        JLabel label_password = new JLabel("Password");
        set_size(label_password);
        this.add(label_password);
        JPasswordField txt_password = new JPasswordField();
        set_size(txt_password);
        this.add(txt_password);
    }
}
