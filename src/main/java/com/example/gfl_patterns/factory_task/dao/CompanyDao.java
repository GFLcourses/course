package com.example.gfl_patterns.factory_task.dao;

import com.example.gfl_patterns.factory_task.dto.CompanyFilterDto;
import com.example.gfl_patterns.factory_task.entity.Company;
import com.example.gfl_patterns.factory_task.exception.DaoException;
import com.example.gfl_patterns.factory_task.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

public class CompanyDao extends BaseDao<Company, Long, CompanyFilterDto> {

    private static final String SAVE_SQL = """
            INSERT INTO factory_task.company(title)
            VALUES (?)
            """;
    private static final String FIND_ALL_SQL = """
            SELECT id,
                   title
            FROM factory_task.company
            """;
    private static final String FIND_BY_ID_SQL = FIND_ALL_SQL + """
            WHERE id = ?
            """;
    private static final String UPDATE_SQL = """
            UPDATE factory_task.company
            SET title = ?
            WHERE id = ?
            """;
    private static final String DELETE_SQL = """
            DELETE FROM factory_task.company
            WHERE id = ?
            """;

    @Override
    Company buildEntity(ResultSet resultSet) throws SQLException {
        return new Company(
                resultSet.getLong("id"),
                resultSet.getString("title")
        );
    }

    @Override
    protected PreparedStatement buildWhereStatement(Connection connection, CompanyFilterDto filter) throws SQLException {
        List<Object> parameters = new ArrayList<>();
        List<String> whereSQL = new ArrayList<>();

        if (filter.getTitle() != null) {
            parameters.add("%" + filter.getTitle() + "%");
            whereSQL.add("title LIKE ?");
        }
        parameters.add(filter.getLimit());
        parameters.add(filter.getOffset());

        String where;
        if (filter.getTitle() != null) {
            where = whereSQL.stream()
                    .collect(joining(" AND ", " WHERE ", " LIMIT ? OFFSET ? "));
        } else {
            where = whereSQL.stream()
                    .collect(joining(" AND ", "", " LIMIT ? OFFSET ? "));
        }
        String dynamicSql = FIND_ALL_SQL + where;

        PreparedStatement statement = connection.prepareStatement(dynamicSql);
        for (int i = 0; i < parameters.size(); i++) {
            statement.setObject(i + 1, parameters.get(i));
        }
        return statement;
    }

    @Override
    public List<Company> findAllByFilter(CompanyFilterDto filter) {
        try (var connection = ConnectionManager.get();
             var statement = buildWhereStatement(connection, filter)) {
            List<Company> companies = new ArrayList<>();
            var resultSet = statement.executeQuery();

            while (resultSet.next()) {
                companies.add(buildEntity(resultSet));
            }
            return companies;
        } catch (SQLException throwable) {
            throw new DaoException(throwable);
        }
    }

    @Override
    public Company save(Company entity) {
        try (var connection = ConnectionManager.get();
             var statement =
                     connection.prepareStatement(SAVE_SQL, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, entity.getTitle());
            statement.executeUpdate();

            var keys = statement.getGeneratedKeys();
            if (keys.next()) {
                entity.setId(keys.getLong("id"));
            }
            return entity;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public Optional<Company> findById(Long key) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(FIND_BY_ID_SQL)) {
            statement.setLong(1, key);
            ResultSet resultSet = statement.executeQuery();

            Company company = null;
            if (resultSet.next()) {
                company = buildEntity(resultSet);
            }
            return Optional.ofNullable(company);
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public List<Company> findAll() {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = statement.executeQuery();

            List<Company> companies = new ArrayList<>();
            while (resultSet.next()) {
                companies.add(buildEntity(resultSet));
            }
            return companies;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public boolean update(Company entity) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(UPDATE_SQL)) {
            statement.setLong(1, entity.getId());
            statement.setString(2, entity.getTitle());

            return statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public boolean delete(Long key) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(DELETE_SQL)) {
            statement.setLong(1, key);
            return statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }
}
