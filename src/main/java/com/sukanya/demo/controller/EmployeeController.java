package com.sukanya.demo.controller;

import com.sukanya.demo.model.Employee;
import com.sukanya.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return status(200).body(employeeService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Long id){
        return status(200).body(employeeService.findById(id));

    }
    @PostMapping
    public ResponseEntity <Employee> create(@RequestBody Employee employee){
        return  status(201).body(employeeService.create(employee));

    }
    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
        return  status(201).body(employeeService.update(employee));

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return  status(201).body(employeeService.delete(id));

    }
}
