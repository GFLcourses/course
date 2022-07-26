package com.task.taskSingleton;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

  public static Connection conn;

    public static void main(String[] args) throws SQLException {
        DBconnectionSingleton connect = DBconnectionSingleton.getInstance();
        conn=connect.getConnection();
    }
}
