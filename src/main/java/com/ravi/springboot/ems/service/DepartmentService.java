package com.ravi.springboot.ems.service;

import com.ravi.springboot.ems.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> findAll();

    public Department findById(String id);

    public void save(Department department);

    public void delete(String theId);

}
