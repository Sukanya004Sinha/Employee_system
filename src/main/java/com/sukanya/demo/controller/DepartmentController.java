package com.sukanya.demo.controller;

import com.sukanya.demo.model.Department;
import com.sukanya.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>>  findAll() {
        return status(200).body(departmentService.findAll());
    }

        @GetMapping("/{id}")
    public ResponseEntity<Department> findById(@PathVariable Long id){
        return (ResponseEntity<Department>)  status(200).body(departmentService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Department> create(@RequestBody Department department){
        return status(201).body(departmentService.create(department));
    }
    @PutMapping()
    public ResponseEntity<Department> update(@RequestBody Department department){
        return  status(201).body(departmentService.update(department));
    }
    public ResponseEntity<String> delete(@PathVariable Long id){
        return status(201).body(departmentService.delete(id));
    }
}
