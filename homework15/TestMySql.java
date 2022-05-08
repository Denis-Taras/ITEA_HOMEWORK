package com.company.homework15;

import org.h2.engine.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySql {
    public static final String DB_URL = "";
    public static final String DB_DRIVER = "";

    public static void main(String[] args) {
        try {
            TestMySql testMtSql = new TestMySql();
            Class.forName(DB_DRIVER);
            User user = new User();
            Connection connection = DriverManager.getConnection(DB_URL, user.getUser(), user.getPassword());
            System.out.println("Соединение с СУБД выполнена.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC драйвер для СУБД не найден.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL.");
        }
    }
}