package com.example.database;

import java.util.HashMap;

public class Employee {
    private int employees_id;
    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;

    public Employee() {}
    public Employee(HashMap<String, Object> data) {
        this.employees_id = (int)data.get("employees_id");
        this.first_name = (String)data.get("first_name");
        this.last_name = (String)data.get("last_name");
        this.email = (String)data.get("email");
        this.username = (String)data.get("username");
        this.password = (String) data.getOrDefault("password", null);
    }
    public Object[] to_table_row() {
        return new Object[] {
                this.employees_id,
                this.first_name,
                this.last_name,
                this.username
        };
    }
}
