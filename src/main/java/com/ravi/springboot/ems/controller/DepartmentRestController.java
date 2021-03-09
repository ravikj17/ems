package com.ravi.springboot.ems.controller;

import com.ravi.springboot.ems.entity.Department;
import com.ravi.springboot.ems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/department")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @GetMapping("/department/{deptCode}")
    public Department getDepartment(@PathVariable String deptCode) {
        Department department = departmentService.findById(deptCode);
        if(department==null) {
            throw new RuntimeException("Department not found with code " + deptCode);
        }
        return department;
    }

    @PostMapping("/department")
    public Department addDepartment(@RequestBody Department department) {
        departmentService.save(department);
        return department;
    }

    @PutMapping("/department")
    public Department updateDepartment(@RequestBody Department department) {
        departmentService.save(department);
        return department;
    }

    @DeleteMapping("/department/{deptCode}")
    public String deleteDepartment(@PathVariable String deptCode) {
        Department department = departmentService.findById(deptCode);
        if(department==null) {
            throw new RuntimeException("Department not found with code " + deptCode);
        }
        departmentService.delete(deptCode);
        return "Deleted department with code " + deptCode;
    }

}
