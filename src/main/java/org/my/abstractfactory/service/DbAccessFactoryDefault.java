package org.my.abstractfactory.service;

public class DbAccessFactoryDefault implements DbAccessFactory {
    @Override
    public DbConnectionService createDbConnectionService() {
        //HERE is a good place to take care about some steps like initialization
        return new DbConnectionServiceMysSql();
    }

    @Override
    public SQLQueriesService createSQLQueriesService() {
        return new SQLQueriesServiceGeneric();
    }
}
