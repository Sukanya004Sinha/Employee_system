package com.sukanya.demo.controller;

import com.sukanya.demo.model.Company;
import com.sukanya.demo.model.Employee;
import com.sukanya.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping
    public ResponseEntity<List<Company>> findAll(){
        return status(200).body(companyService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> findById(@PathVariable Long id){
        return (ResponseEntity<Company>) status(200).body(companyService.findById(id));

    }
    @PostMapping
    public ResponseEntity <Company> create(@RequestBody Company company){
        return  status(201).body(companyService.create(company));

    }
    @PutMapping
    public ResponseEntity<Company> update(@RequestBody Company company){
        return  status(201).body(companyService.update(company));

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return  status(201).body(companyService.delete(id));

    }
}
