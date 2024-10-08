package com.learning.demo.connection.pool;

import com.learning.demo.connection.ConnectionPool;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikariDataSourcePoolTest {

    ConnectionPool pool = new HikariDataSourcePool();

    @Test
    @DisplayName("Test Hikari Connection")
    void getConnection() {
        assertNotNull(pool.getConnection());
    }
}