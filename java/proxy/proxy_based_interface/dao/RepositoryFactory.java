package com.zxf.cloud.api.dynamicproxy.dao;

import java.lang.reflect.Proxy;

public class RepositoryFactory {
    public static <T extends Repository> T getRepository(Class<T> repositoryType) {
        RepositoryInvocationHandler repositoryInvocationHandler = new RepositoryInvocationHandler();
        T repository = (T) (Proxy.newProxyInstance(repositoryType.getClassLoader(), new Class[]{repositoryType},
                repositoryInvocationHandler));
        return repository;
    }
}
