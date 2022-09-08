package com.example.logic;

import com.example.database.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheck {

    public static boolean for_data(String username, String password) {
        try {
            ResultSet rs = DBConnection.select("SELECT * FROM login WHERE username = ? AND password = PASSWORD(?)",
                    new Object[]{username, password});
            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
