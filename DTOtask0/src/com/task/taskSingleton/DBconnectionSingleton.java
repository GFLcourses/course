package com.task.taskSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DBconnectionSingleton {

    volatile static DBconnectionSingleton s;

    public static Connection conn;
    public static Statement stmt = null;
    public static String login = "user";
    public static String password = "passWOrd";


    private DBconnectionSingleton() throws SQLException {
        // create single instance of DB connection 
        Properties connectionProps = new Properties();
        connectionProps.put("user", login);
        connectionProps.put("password", password);// port & db name
        System.out.println("Loading driver...");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/movyloDB",
                connectionProps
        );
    }

    public Connection getConnection() throws SQLException {
        return conn;
    }

    public static DBconnectionSingleton getInstance() throws SQLException {

        if (s == null) {
            synchronized (DBconnectionSingleton.class) {
                if (s == null) {
                    s = new DBconnectionSingleton();
                    System.out.println("First DB connection successfully.");
                }
            }
        }
        conn = s.getConnection();
        return s;
    }
}
