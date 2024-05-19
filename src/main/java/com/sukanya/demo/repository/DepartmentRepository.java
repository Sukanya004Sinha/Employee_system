package com.sukanya.demo.repository;

import com.sukanya.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class DepartmentRepository implements JpaRepository<Department, Long> {
}
