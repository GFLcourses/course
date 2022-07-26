package com.example.gfl_patterns.facade_task.exception;

public class StoreIsFullException extends RuntimeException {

    public StoreIsFullException(String message) {
        super(message);
    }
}
