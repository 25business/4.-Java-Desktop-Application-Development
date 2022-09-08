package com.example.gui.panels;

import com.example.events.SaveEmployeeAction;

import javax.swing.*;

public class NewEmployeePanel extends JPanel {

    public NewEmployeePanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label_first_name = new JLabel("First name");
        JLabel label_last_name = new JLabel("Last name");
        JLabel label_email = new JLabel("E-mail");
        JLabel label_username = new JLabel("Username");
        JLabel label_password = new JLabel("Password");
        JLabel label_user_type = new JLabel("User Type");
        JTextField text_first_name = new JTextField();
        JTextField text_last_name = new JTextField();
        JTextField text_email = new JTextField();
        JTextField text_username = new JTextField();
        JPasswordField text_password = new JPasswordField();
        JComboBox<String> combo_user_type = new JComboBox<>(
                new String[]{"admin", "user", "blocked"}
        );

        this.add(label_first_name);
        this.add(text_first_name);
        this.add(label_last_name);
        this.add(text_last_name);
        this.add(label_email);
        this.add(text_email);
        this.add(label_username);
        this.add(text_username);
        this.add(label_password);
        this.add(text_password);
        this.add(label_user_type);
        this.add(combo_user_type);

        JButton button_save = new JButton("Save");
        button_save.addActionListener(new SaveEmployeeAction(
                text_first_name, text_last_name, text_email, text_username,
                text_password, combo_user_type
        ));
        this.add(button_save);
    }
}
