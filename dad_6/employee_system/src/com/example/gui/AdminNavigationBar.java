package com.example.gui;

import javax.swing.*;

public class AdminNavigationBar extends JMenuBar {

    public AdminNavigationBar() {
        super();
        JMenu program_menu = new JMenu("Program");
        JMenuItem close_menu_item = new JMenuItem("Close");
        program_menu.add(close_menu_item);

        JMenu employees_menu = new JMenu("Employees");
        JMenuItem all_employees_item = new JMenuItem("View All");
        employees_menu.add(all_employees_item);
        JMenuItem add_employee_item = new JMenuItem("New");
        employees_menu.add(add_employee_item);
        JMenuItem edit_employee_item = new JMenuItem("Edit");
        employees_menu.add(edit_employee_item);
        JMenuItem delete_employee_item = new JMenuItem("Delete");
        employees_menu.add(delete_employee_item);

        this.add(program_menu);
        this.add(employees_menu);
    }
}
