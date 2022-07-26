package com.example.gfl_patterns.facade_task.exception;

public class EntityNoSuchException extends RuntimeException {

    public EntityNoSuchException(String message) {
        super(message);
    }
}
