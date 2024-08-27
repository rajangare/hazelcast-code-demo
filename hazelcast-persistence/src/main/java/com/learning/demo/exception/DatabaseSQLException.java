package com.learning.demo.exception;

public class DatabaseSQLException extends RuntimeException {
    public DatabaseSQLException(String message) {
        super(message);
    }
}
