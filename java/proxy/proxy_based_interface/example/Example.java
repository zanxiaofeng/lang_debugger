package com.zxf.cloud.api.dynamicproxy.example;

import com.zxf.cloud.api.dynamicproxy.dao.RepositoryFactory;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        ProjectRepository repository = RepositoryFactory.getRepository(ProjectRepository.class);
        List<Project> projects = repository.findAll();
    }
}
