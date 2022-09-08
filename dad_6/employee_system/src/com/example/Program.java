package com.example;

import com.example.database.EmployeeDAO;
import com.example.gui.LoginWindow;

public class Program {
    public static void main(String[] args) {
        //LoginWindow loginWindow = new LoginWindow();
        //loginWindow.setVisible(true);
        System.out.println(EmployeeDAO.all().size());
    }
}
