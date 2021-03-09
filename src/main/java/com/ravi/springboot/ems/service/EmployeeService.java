package com.ravi.springboot.ems.service;

import com.ravi.springboot.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void delete(int theId);

}
