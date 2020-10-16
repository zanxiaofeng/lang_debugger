package com.zxf.cloud.api.dynamicproxy.dao;

import com.zxf.cloud.api.dynamicproxy.example.Project;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;

public class RepositoryInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Query query = method.getAnnotation(Query.class);
        if (query != null) {
            System.out.println("OnQuery:: " + method.getName() + " :: " + query.value());
        }
        return Collections.singletonList(new Project("project-id-zxf", "project name"));
    }
}
