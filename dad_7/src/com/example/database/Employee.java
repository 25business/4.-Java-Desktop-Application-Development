package com.example.database;

import java.util.HashMap;

public class Employee {
    private int employees_id;
    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;
    private String user_type;

    public Employee() {}
    public Employee(HashMap<String, Object> data) {
        this.employees_id = (int)data.get("employees_id");
        this.first_name = (String)data.get("first_name");
        this.last_name = (String)data.get("last_name");
        this.email = (String)data.get("email");
        this.username = (String)data.get("username");
        this.password = (String) data.getOrDefault("password", null);
        this.user_type = (String) data.getOrDefault("user_type", null);
    }
    public Object[] to_table_row() {
        return new Object[] {
                this.employees_id,
                this.first_name,
                this.last_name,
                this.username
        };
    }

    public String getUser_type() {
        return user_type;
    }

    public int getEmployees_id() {
        return employees_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
