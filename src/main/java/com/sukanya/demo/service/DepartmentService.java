package com.sukanya.demo.service;

import com.sukanya.demo.model.Department;
import com.sukanya.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
    public Department findById(Long id){
        return departmentRepository.findById(id).get(); // its return optional

    }
    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    public Department update(Department department){
        departmentRepository.findById(department.getDepartment_id()).orElseThrow(()-> new RuntimeException("Department not found"));
        return departmentRepository.save(department);
    }
    public String delete(Long id){
        departmentRepository.findById(id).orElseThrow(()->new RuntimeException("Company not found"));
        return "department deleted";
    }

    }
