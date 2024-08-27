package com.learning.demo.connection;

import java.sql.Connection;

public interface ConnectionPool {
    Connection getConnection();
}
