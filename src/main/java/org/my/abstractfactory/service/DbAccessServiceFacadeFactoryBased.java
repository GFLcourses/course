package org.my.abstractfactory.service;

public class DbAccessServiceFacadeFactoryBased implements DbAccessService {
    private SQLQueriesService sqlQueriesService;
    private DbConnectionService dbConnectionService;

    public DbAccessServiceFacadeFactoryBased(DbAccessFactory dbAccessFactory) {
        this.sqlQueriesService = dbAccessFactory.createSQLQueriesService();
        this.dbConnectionService = dbAccessFactory.createDbConnectionService();
    }

    public DbAccessServiceFacadeFactoryBased(AbstractFactory abstractFactory) {
        this.sqlQueriesService = abstractFactory.create(SQLQueriesService.class);
        this.dbConnectionService = abstractFactory.create(DbConnectionService.class);
    }

    @Override
    public String getUserById(String id) {
        String sql = sqlQueriesService.constructSqlSearchUserById(id);
        return dbConnectionService.invokeSql(sql);
    }
}
