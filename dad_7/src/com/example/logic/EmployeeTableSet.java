package com.example.logic;

import com.example.database.Employee;
import com.example.database.EmployeeDAO;

import java.util.ArrayList;

public class EmployeeTableSet {

    public static Object[][] get() {
        ArrayList<Employee> employees = EmployeeDAO.all();
        Object[][] data_set = new Object[employees.size()][4];
        for(int i = 0; i < employees.size(); i++)
            data_set[i] = employees.get(i).to_table_row();
        return data_set;
    }
}
