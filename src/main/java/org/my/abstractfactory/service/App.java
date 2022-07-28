package org.my.abstractfactory.service;

public class App {
    private static final String ID = "random id";

    public static void main(String[] args) {
        DbAccessFactory dbAccessFactory = new DbAccessFactoryDefault();
        DbAccessService dbAccessService = new DbAccessServiceFacadeFactoryBased(dbAccessFactory);
        String result = dbAccessService.getUserById(ID);
        System.out.println("***********************");
        System.out.println(result);
    }
}
