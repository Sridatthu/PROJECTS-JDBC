package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDetails {
    //private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/truckmgt";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}