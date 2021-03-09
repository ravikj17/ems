package com.ravi.springboot.ems.service;

import com.ravi.springboot.ems.dao.DepartmentRepository;
import com.ravi.springboot.ems.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(String id) {
        Optional<Department> result = departmentRepository.findById(id);
        Department department = null;
        if(result.isPresent()) {
            department = result.get();
        }
        else {
            throw new RuntimeException("Cant find department code " + id);
        }
        return department;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void delete(String theId) {
    departmentRepository.deleteById(theId);
    }
}
