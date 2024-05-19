package com.sukanya.demo.service;

import com.sukanya.demo.model.Employee;
import com.sukanya.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository  employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
    public Employee findById(Long id){
        return employeeRepository.findById(id).get(); //its returns optional

    }
    public Employee create(Employee employee){
        return employeeRepository.save(employee);

    }
    public Employee update(Employee employee){
        employeeRepository.findById(employee.getId()).orElseThrow(()->new RuntimeException("Employee not found"));
        return employeeRepository.save(employee);

    }
    public String delete(Long id){
        employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
        return "Employee deleted";

    }
}
