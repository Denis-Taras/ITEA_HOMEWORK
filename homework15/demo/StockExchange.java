package com.company.homework15.demo;

import sql.demo.repository.ShareRates;
import sql.demo.repository.Shares;
import sql.demo.repository.TraiderShareActions;
import sql.demo.repository.Traiders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StockExchange {
    public static final String DB_URL = "Ссылка на БД";
    public static final String DB_DRIVER = "Ссылка на драйвер";

    //таблицы СУБД
    private Traiders traiders;
    private ShareRates shareRates;
    private Shares shares;
    private TraiderShareActions traiderShareActions;

    //инициализация
    public StockExchange() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);
        //инициализация таблиц
        traiders = new Traiders();
        shares = new Shares();
        shareRates = new ShareRates();
        traiderShareActions = new TraiderShareActions();
    }

    //получить новое соединение с БД
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL);
        System.out.println("Соединение с СУБД выполнена.");
        return connection;
    }

    private void createTablesAndForeignKeys() throws SQLException {
        shares.createTable();
        shareRates.createTable();
        traiders.createTable();
        traiderShareActions.createTable();
        //создание внещних ключей - связь между таблицами
        shareRates.createForeignKeys();
        traiderShareActions.createForeignKeys();
    }

    public static void main(String[] args) {
        try {
            StockExchange stockExchange = new StockExchange();
            stockExchange.createTablesAndForeignKeys();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки Class.forName
            System.out.println("JDBC драйвер для СУБД не найден.");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибки DriverManager.getConnection
            System.out.println("Ошибка SQL.");
        }
    }
}