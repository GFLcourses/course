package org.my.abstractfactory.service;

public interface AbstractFactory {
    <T> T create(Class<T> clazz);
}
