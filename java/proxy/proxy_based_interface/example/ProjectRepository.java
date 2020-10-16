package com.zxf.cloud.api.dynamicproxy.example;

import com.zxf.cloud.api.dynamicproxy.dao.Query;
import com.zxf.cloud.api.dynamicproxy.dao.Repository;

import java.util.List;

public interface ProjectRepository extends Repository {
    @Query("select * from t_project")
    List<Project> findAll();
}
