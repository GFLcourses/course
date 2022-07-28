package org.my.abstractfactory.service;

public class SQLQueriesServiceGeneric implements SQLQueriesService {

    @Override
    public String constructSqlSearchUserById(String id) {
        String sql = String.format("SELECT * FROM user where id = %s", id);
        System.out.println(sql);
        return sql;
    }
}
