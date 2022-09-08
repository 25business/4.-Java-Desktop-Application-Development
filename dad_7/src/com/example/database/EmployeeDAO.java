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

    public static boolean save(Object[] employee_data) {
        Object[] employees_data = new Object[] {
                employee_data[0], employee_data[1], employee_data[2]
        };
        try {
            int employee_id = DBConnection.insert("INSERT INTO employees VALUES (NULL, ?, ?, ?);",
                    employees_data);

            Object[] login_data = new Object[] {
                    employee_data[3], employee_data[4], employee_id, employee_data[5]
            };

            int changes = DBConnection.insert("INSERT INTO login VALUES (?, PASSWORD(?), ?, ?);",
                    login_data);
            return changes > 0;
        }catch (Exception ex) { ex.printStackTrace(); }
        return false;
    }

    public static boolean update(Object[] employee_data) {
        Object[] employees_data = new Object[] {
            employee_data[1], employee_data[2], employee_data[3],
            employee_data[0]
        };
        Object[] login_data;
        if(String.valueOf(employee_data[5]).equals("")) {
            login_data = new Object[] {
                    employee_data[4], employee_data[6],
                    employee_data[0]
            };
        } else {
            login_data = new Object[]{
                    employee_data[4], employee_data[5], employee_data[6],
                    employee_data[0]
            };
        }
        try {
            int changed1 = DBConnection.update("""
                    UPDATE employees SET
                    first_name = ?, last_name = ?,
                    email = ? WHERE employees_id = ?;""", employees_data);
            if(changed1 > 0) {
                int changed2 = 0;
                if(login_data.length == 4) {
                    changed2 = DBConnection.update("""
                            UPDATE login SET username = ?, 
                            password = PASSWORD(?), user_type = ?
                            WHERE employees_id = ?;""", login_data);
                } else {
                    changed2 = DBConnection.update("""
                            UPDATE login SET username = ?, 
                            user_type = ?
                            WHERE employees_id = ?;""", login_data);
                }
                return changed2 > 0;
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return false;
    }

    public static Employee get(int employee_id) {
        Employee employee = null;
        try {
            ResultSet rs = DBConnection.select("""
                    SELECT * FROM employees, login 
                    WHERE (employees.employees_id = login.employees_id) AND 
                    (employees.employees_id = ?);""", new Object[]{employee_id});
            if(rs.next()) {
                HashMap<String, Object> data = new HashMap<>();
                data.put("employees_id", rs.getInt("employees_id"));
                data.put("first_name", rs.getString("first_name"));
                data.put("last_name", rs.getString("last_name"));
                data.put("email", rs.getString("email"));
                data.put("username", rs.getString("username"));
                data.put("user_type", rs.getString("user_type"));
                employee = new Employee(data);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return employee;
    }

    public static boolean delete(int employee_id) {
        try {
            int result = DBConnection.delete("DELETE FROM employees WHERE employees_id = ?",
                    new Object[]{ employee_id });
            return result > 0;
        } catch (Exception ex) { ex.printStackTrace(); }
        return false;
    }
}
