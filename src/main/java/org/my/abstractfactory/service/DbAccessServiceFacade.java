package org.my.abstractfactory.service;

public class DbAccessServiceFacade implements DbAccessService {
    private SQLQueriesService sqlQueriesService;
    private DbConnectionService dbConnectionService;

    public DbAccessServiceFacade(SQLQueriesService sqlQueriesService, DbConnectionService dbConnectionService) {
        this.sqlQueriesService = sqlQueriesService;
        this.dbConnectionService = dbConnectionService;
    }

    @Override
    public String getUserById(String id) {
        String sql = sqlQueriesService.constructSqlSearchUserById(id);
        return dbConnectionService.invokeSql(sql);
    }
}
