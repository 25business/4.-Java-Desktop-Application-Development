package com.example.events;

import com.example.database.EmployeeDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveEmployeeAction implements ActionListener {
    private JTextField text_first_name;
    private JTextField text_last_name;
    private JTextField text_email;
    private JTextField text_username;
    private JPasswordField text_password;
    private JComboBox<String> combo_user_type;

    public SaveEmployeeAction(JTextField text_first_name, JTextField text_last_name, JTextField text_email, JTextField text_username, JPasswordField text_password, JComboBox<String> combo_user_type) {
        this.text_first_name = text_first_name;
        this.text_last_name = text_last_name;
        this.text_email = text_email;
        this.text_username = text_username;
        this.text_password = text_password;
        this.combo_user_type = combo_user_type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object[] employee_data = new Object[] {
          this.text_first_name.getText(),
          this.text_last_name.getText(),
          this.text_email.getText(),
          this.text_username.getText(),
          String.valueOf(text_password.getPassword()),
          combo_user_type.getSelectedItem()
        };
        boolean result = EmployeeDAO.save(employee_data);
        if(result) {
            JOptionPane.showMessageDialog(null, "Employee has been saved!",
                    "Employee saved", JOptionPane.INFORMATION_MESSAGE);
            text_first_name.setText("");
            text_last_name.setText("");
            text_email.setText("");
            text_username.setText("");
            text_password.setText("");
            combo_user_type.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "There was an error saving the employee!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
