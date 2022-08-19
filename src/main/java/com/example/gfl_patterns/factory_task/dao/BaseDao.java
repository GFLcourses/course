package com.example.gfl_patterns.factory_task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class BaseDao<E, K, F> implements Dao<E, K> {

    abstract E buildEntity(ResultSet resultSet) throws SQLException;

    protected abstract PreparedStatement buildWhereStatement(Connection connection, F filter) throws SQLException;

    public abstract List<E> findAllByFilter(F filter);

    @Override
    public abstract E save(E entity);

    @Override
    public abstract Optional<E> findById(K key);

    @Override
    public abstract List<E> findAll();

    @Override
    public abstract boolean update(E entity);

    @Override
    public abstract boolean delete(K key);
}
