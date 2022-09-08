package com.example.gui;

import com.example.database.EmployeeDAO;
import com.example.gui.panels.AllEmployeesPanel;
import com.example.gui.panels.NewEmployeePanel;
import com.example.gui.panels.UpdateEmployeePanel;
import com.example.logic.EmployeeTableSet;

import javax.swing.*;

public class AdminNavigationBar extends JMenuBar {

    private void load_panel(JPanel panel) {
        AdminWindow.mainContainer.removeAll();
        AdminWindow.mainContainer.add(panel);
        AdminWindow.mainContainer.revalidate();
        AdminWindow.mainContainer.repaint();
    }

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

        all_employees_item.addActionListener( actionEvent -> {
            load_panel(new AllEmployeesPanel());
        });
        add_employee_item.addActionListener( actionEvent -> {
            load_panel(new NewEmployeePanel());
        });
        edit_employee_item.addActionListener( actionEvent -> {
            int row = AllEmployeesPanel.employeesTable.getSelectedRow();
            if(row != -1) {
                load_panel(new UpdateEmployeePanel());
            } else {
                JOptionPane.showMessageDialog(null, "You need to select an employee from the table.",
                        "Selection Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        delete_employee_item.addActionListener(actionEvent -> {
            int row = AllEmployeesPanel.employeesTable.getSelectedRow();
            if(row != -1) {
                int employee_id = (int)AllEmployeesPanel.employeesTable.getModel().getValueAt(row, 0);

                if(JOptionPane.showConfirmDialog(null, "Are you are sure you want to delete selected employee?",
                        "Confirm Deletion", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    boolean result = EmployeeDAO.delete(employee_id);
                    if(result) {
                        JOptionPane.showMessageDialog(null, "Employee has been deleted.",
                                "Delete Success", JOptionPane.INFORMATION_MESSAGE);
                        // TODO: Dodaj table update
                        String[] tableHeaders = new String[] {"ID", "First name", "Last name", "Username"};
                        Object[][] employee_data = EmployeeTableSet.get();
                        AllEmployeesPanel.employeesTable = new JTable(employee_data, tableHeaders);
                        AllEmployeesPanel.employeesTable.revalidate();
                        AllEmployeesPanel.employeesTable.repaint();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error deleting employee.",
                                "Delete Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "You need to select an employee from the table.",
                        "Selection Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        this.add(program_menu);
        this.add(employees_menu);
    }
}
