package com.example.gui.panels;

import com.example.database.Employee;
import com.example.database.EmployeeDAO;
import com.example.events.UpdateEmployeeAction;

import javax.swing.*;

public class UpdateEmployeePanel extends JPanel {
    public UpdateEmployeePanel() {
        super();
        // Dobiti zaposlenog na osnovu JTable
        int row = AllEmployeesPanel.employeesTable.getSelectedRow();
        int employee_id = (int)AllEmployeesPanel.employeesTable.getModel().getValueAt(row, 0);
        Employee employee = EmployeeDAO.get(employee_id);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label_first_name = new JLabel("First name");
        JLabel label_last_name = new JLabel("Last name");
        JLabel label_email = new JLabel("E-mail");
        JLabel label_username = new JLabel("Username");
        JLabel label_password = new JLabel("Password");
        JLabel label_user_type = new JLabel("User Type");
        JTextField text_first_name = new JTextField(employee.getFirst_name());
        JTextField text_last_name = new JTextField(employee.getLast_name());
        JTextField text_email = new JTextField(employee.getEmail());
        JTextField text_username = new JTextField(employee.getUsername());
        JPasswordField text_password = new JPasswordField();
        JComboBox<String> combo_user_type = new JComboBox<>(
                new String[]{"admin", "user", "blocked"}
        );
        combo_user_type.setSelectedItem(employee.getUser_type());

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

        JButton button_update = new JButton("Update");
        button_update.addActionListener(new UpdateEmployeeAction(
                employee_id, text_first_name, text_last_name,
                text_email, text_username, text_password, combo_user_type
        ));
        this.add(button_update);
    }
}
