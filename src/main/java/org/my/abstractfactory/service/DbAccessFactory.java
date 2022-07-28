package org.my.abstractfactory.service;

public interface DbAccessFactory {
    DbConnectionService createDbConnectionService();
    SQLQueriesService createSQLQueriesService();
}
