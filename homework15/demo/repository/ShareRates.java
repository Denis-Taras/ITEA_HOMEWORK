package com.company.homework15.demo.repository;

import java.sql.SQLException;

public class ShareRates extends BaseTable implements TableOperations{
    public ShareRates() throws SQLException {
        super("share_rates");
    };

    @Override
    public void createTable() throws SQLException {
        super.executeSqlStatement("CREATE TABLE IF NOT EXISTS share_rates(" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                "operDate datetime NOT NULL," +
                "share BIGINT NOT NULL," +
                "rate DECIMAL(15,2) NOT NULL);", "Созданная таблица " + getTableName());
    }

    @Override
    public void createForeignKeys() throws SQLException {
        super.executeSqlStatement("ALTER TABLE share_rates ADD FOREIGN KEY(share) REFERENCES shares(id);",
                "Создан внешний ключ share_rates.share --> shares.id");
    }
}