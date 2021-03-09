package com.ravi.springboot.ems.dao;

import com.ravi.springboot.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
