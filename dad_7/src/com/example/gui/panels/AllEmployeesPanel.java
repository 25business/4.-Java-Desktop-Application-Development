package com.example.gui.panels;

import com.example.logic.EmployeeTableSet;

import javax.swing.*;
import java.awt.*;

public class AllEmployeesPanel extends JPanel {
    public static JTable employeesTable;

    public AllEmployeesPanel() {
        super();
        this.setLayout(new BorderLayout());

        String[] tableHeaders = new String[] {"ID", "First name", "Last name", "Username"};
        Object[][] employee_data = EmployeeTableSet.get();
        employeesTable = new JTable(employee_data, tableHeaders);
        JScrollPane tableScroll = new JScrollPane(employeesTable);

        this.add(tableScroll, BorderLayout.CENTER);
    }
}
