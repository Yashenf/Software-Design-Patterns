package com.yashen.dp.singleton;

import java.sql.Connection;

public class DBConnection {
    private static  DBConnection dbConnection = new DBConnection();

    private DBConnection(){
        // so now we can create objects outside of this class.
    }

    public static synchronized DBConnection getInstance(){
        return dbConnection == null ? (dbConnection = new DBConnection()):dbConnection;
    }

}
