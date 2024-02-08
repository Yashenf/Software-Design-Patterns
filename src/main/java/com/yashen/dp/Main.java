package com.yashen.dp;

import com.yashen.dp.singleton.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.toString());
    }
}