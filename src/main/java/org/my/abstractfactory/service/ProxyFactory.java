package org.my.abstractfactory.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements AbstractFactory {

    @Override
    public <T> T create(Class<T> clazz) {
        if (clazz.isAssignableFrom(DbConnectionService.class))
            //It's worse to create all this services as singletons
            return (T)new DbConnectionServiceMysSql();

        return (T) Proxy
                .newProxyInstance(clazz.getClassLoader(), new Class[] { clazz }, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // constructSqlSearchUserById
                        // constructSqlSearchProductByType
                        if (method.getName().startsWith("constructSqlSearch")) {
                            String param = (String)args[0];
                            String tableNameAndParameter = method.getName().substring(18, method.getName().length());
                            String[] tableNameParameter = tableNameAndParameter.split("By");
                            String sql = String.format("SELECT * FROM %s where %s = %s", tableNameParameter[0].toLowerCase(), tableNameParameter[1].toLowerCase(), param);
                            System.out.println(sql);
                            return sql;
                        }
                        return null;
                    }
                });
    }
}
