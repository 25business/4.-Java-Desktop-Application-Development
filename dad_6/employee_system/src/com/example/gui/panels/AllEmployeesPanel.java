package com.example.gui.panels;

import javax.swing.*;
import java.awt.*;

public class AllEmployeesPanel extends JPanel {

    public AllEmployeesPanel() {
        super();
        this.setLayout(new BorderLayout());

        String[] tableHeaders = new String[] {"ID", "First name", "Last name", "Username"};
        Object[][] blank_data = new Object[][] {};
        JTable employeesTable = new JTable(blank_data, tableHeaders);
        JScrollPane tableScroll = new JScrollPane(employeesTable);

        this.add(tableScroll, BorderLayout.CENTER);
    }
}
