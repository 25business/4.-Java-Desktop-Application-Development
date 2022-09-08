package com.example.database;

import java.sql.*;

public class DBConnection {
    private static DBConnection instance;
    private Connection connection;

    private DBConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/dad_employee_system",
                    "jadmin", "1234");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public static Connection get() {
        if(instance == null) {
            instance = new DBConnection();
        }
        return instance.connection;
    }

    public static ResultSet select(String prepared_sql, Object[] arguments) throws SQLException {
        Connection connection = get();
        PreparedStatement statement = connection.prepareStatement(prepared_sql);
        for(int i = 0; i < arguments.length; i++) {
            statement.setObject(i+1, arguments[i]);
        }
        return statement.executeQuery();
    }

    public static int insert(String prepared_sql, Object[] arguments) throws SQLException {
        Connection connection = get();
        PreparedStatement statement = connection.prepareStatement(prepared_sql, Statement.RETURN_GENERATED_KEYS);
        for(int i = 0; i < arguments.length; i++) {
            statement.setObject(i+1, arguments[i]);
        }
        int affected_rows = statement.executeUpdate();
        ResultSet rs = statement.getGeneratedKeys();
        if(rs.next()) affected_rows = rs.getInt(1);
        return affected_rows;
    }

    public static int update(String prepared_sql, Object[] arguments) throws SQLException {
        Connection connection = get();
        PreparedStatement statement = connection.prepareStatement(prepared_sql);
        for(int i = 0; i < arguments.length; i++) {
            statement.setObject(i+1, arguments[i]);
        }
        return statement.executeUpdate();
    }

    public static int delete(String prepared_sql, Object[] arguments) throws SQLException {
        return update(prepared_sql, arguments);
    }
}
