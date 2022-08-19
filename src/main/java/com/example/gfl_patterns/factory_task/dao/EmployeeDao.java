package com.example.gfl_patterns.factory_task.dao;

import com.example.gfl_patterns.factory_task.dto.EmployeeFilterDto;
import com.example.gfl_patterns.factory_task.entity.Employee;
import com.example.gfl_patterns.factory_task.exception.DaoException;
import com.example.gfl_patterns.factory_task.factory.Factory;
import com.example.gfl_patterns.factory_task.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.joining;

public class EmployeeDao extends BaseDao<Employee, Long, EmployeeFilterDto> {

    private static final String SAVE_SQL = """
            INSERT INTO factory_task.employee(first_name, last_name, company_id)
            VALUES (?, ?, ?)
            """;
    private static final String FIND_ALL_SQL = """
            SELECT e.id,
                   e.first_name,
                   e.last_name,
                   e.company_id,
                   c.id,
                   c.title
            FROM factory_task.employee e
            JOIN factory_task.company c on c.id = e.company_id
            """;
    private static final String FIND_BY_ID_SQL = FIND_ALL_SQL + """
            WHERE e.id = ?
            """;
    private static final String UPDATE_SQL = """
            UPDATE factory_task.employee
            SET first_name = ?,
                last_name = ?,
                company_id = ?
            WHERE id = ?
            """;
    private static final String DELETE_SQL = """
            DELETE FROM factory_task.employee
            WHERE id = ?
            """;

    private final CompanyDao companyDao;

    public EmployeeDao(Factory factory) {
        this.companyDao = factory.createBean(CompanyDao.class);
    }

    @Override
    Employee buildEntity(ResultSet resultSet) throws SQLException {
        return new Employee(
                resultSet.getLong("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                this.companyDao.buildEntity(resultSet)
        );
    }

    @Override
    protected PreparedStatement buildWhereStatement(Connection connection, EmployeeFilterDto filter) throws SQLException {
        List<Object> parameters = new ArrayList<>();
        List<String> whereSQL = new ArrayList<>();

        if (filter.getFirstName() != null) {
            parameters.add("%" + filter.getFirstName() + "%");
            whereSQL.add("first_name LIKE ?");
        }
        if (filter.getLastName() != null) {
            parameters.add("%" + filter.getLastName() + "%");
            whereSQL.add("last_name LIKE ?");
        }
        if (filter.getCompanyId() != null) {
            parameters.add(filter.getCompanyId());
            whereSQL.add("company_id = ?");
        }
        parameters.add(filter.getLimit());
        parameters.add(filter.getOffset());

        String where;
        if (filter.getFirstName() != null|| filter.getLastName() != null || filter.getCompanyId() != null) {
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
    public List<Employee> findAllByFilter(EmployeeFilterDto filter) {
        try (var connection = ConnectionManager.get();
             var statement = buildWhereStatement(connection, filter)) {
            List<Employee> employees = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                employees.add(buildEntity(resultSet));
            }
            return employees;
        } catch (SQLException throwable) {
            throw new DaoException(throwable);
        }
    }

    @Override
    public Employee save(Employee entity) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(SAVE_SQL,
                     Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setLong(3, entity.getCompany().getId());

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
    public Optional<Employee> findById(Long key) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(FIND_BY_ID_SQL)) {
            statement.setLong(1, key);
            ResultSet resultSet = statement.executeQuery();

            Employee employee = null;
            if (resultSet.next()) {
                employee = buildEntity(resultSet);
            }
            return Optional.ofNullable(employee);
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public List<Employee> findAll() {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(FIND_ALL_SQL)) {
            ResultSet resultSet = statement.executeQuery();

            List<Employee> employees = new ArrayList<>();
            while (resultSet.next()) {
                employees.add(buildEntity((resultSet)));
            }
            return employees;
        } catch (SQLException throwables) {
            throw new DaoException(throwables);
        }
    }

    @Override
    public boolean update(Employee entity) {
        try (var connection = ConnectionManager.get();
             var statement = connection.prepareStatement(UPDATE_SQL)) {
            statement.setString(1, entity.getFirstName());
            statement.setString(2, entity.getLastName());
            statement.setLong(3, entity.getCompany().getId());
            statement.setLong(4, entity.getId());

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
