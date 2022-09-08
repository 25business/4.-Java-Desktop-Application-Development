package com.example.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeDAO {

    public static ArrayList<Employee> all() {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.select("""
                            SELECT * FROM employees, login
                            WHERE (employees.employees_id = login.employees_id);""",
                    new Object[]{});
            while(rs.next()) {
                HashMap<String, Object> data = new HashMap<>();
                data.put("employees_id", rs.getInt("employees_id"));
                data.put("first_name", rs.getString("first_name"));
                data.put("last_name", rs.getString("last_name"));
                data.put("email", rs.getString("email"));
                data.put("username", rs.getString("username"));
                employees.add(new Employee(data));
            }
        } catch (SQLException ex) { ex.printStackTrace(); }
        return employees;
    }
}
