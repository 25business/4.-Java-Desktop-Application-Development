package com.example.events;

import com.example.database.EmployeeDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateEmployeeAction implements ActionListener {
    private int employees_id;
    private JTextField text_first_name;
    private JTextField text_last_name;
    private JTextField text_email;
    private JTextField text_username;
    private JPasswordField text_password;
    private JComboBox<String> combo_user_type;

    public UpdateEmployeeAction(int employees_id, JTextField text_first_name, JTextField text_last_name, JTextField text_email, JTextField text_username, JPasswordField text_password, JComboBox<String> combo_user_type) {
        this.employees_id = employees_id;
        this.text_first_name = text_first_name;
        this.text_last_name = text_last_name;
        this.text_email = text_email;
        this.text_username = text_username;
        this.text_password = text_password;
        this.combo_user_type = combo_user_type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object[] employee_data = new Object[]{
                this.employees_id,
                this.text_first_name.getText(),
                this.text_last_name.getText(),
                this.text_email.getText(),
                this.text_username.getText(),
                String.valueOf(text_password.getPassword()),
                combo_user_type.getSelectedItem()
        };
        boolean result = EmployeeDAO.update(employee_data);
        if (result) {
            JOptionPane.showMessageDialog(null, "Employee has been updated!",
                    "Employee updated", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "There was an error updating the employee!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}