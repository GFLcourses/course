package com.example.gfl_patterns.factory_task.exception;

public class BeanNotExistException extends RuntimeException {

    public BeanNotExistException(String message) {
        super(message);
    }
}
