package com.company.homework15.demo.repository;

import java.sql.SQLException;

//операции с таблицами
public interface TableOperations {

    void createTable() throws SQLException; //создание таблицы

    void createForeignKeys() throws SQLException; //создание связей между таблицами
}