package org.my.abstractfactory.service;

public class AppIoC {
    private static final String ID = "random id";

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        DbAccessService dbAccessService = new DbAccessServiceFacadeFactoryBased(proxyFactory);
        String result = dbAccessService.getUserById(ID);
        System.out.println(result);

        SQLQueriesProductService productService = proxyFactory.create(SQLQueriesProductService.class);

        SQLQueriesService sqlQueriesService = proxyFactory.create(SQLQueriesService.class);

        System.out.println(productService.constructSqlSearchProductByType("car"));
        System.out.println(sqlQueriesService.constructSqlSearchUserById(ID));
    }
}
