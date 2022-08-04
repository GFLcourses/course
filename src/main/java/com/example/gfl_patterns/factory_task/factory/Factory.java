package com.example.gfl_patterns.factory_task.factory;

public interface Factory {

    public <T> T createBean(Class<T> clazz);
}
