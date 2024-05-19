package com.sukanya.demo.service;

import com.sukanya.demo.model.Company;

import com.sukanya.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyService {
@Autowired
private CompanyRepository companyRepository;


    public List<Company> findAll(){
        return companyRepository.findAll();
    }
    public Company findById(Long id){
        return companyRepository.findById(id).get(); //its returns optional

    }
    public Company create(Company company){
        return companyRepository.save(company);

    }
    public Company update(Company company){
        companyRepository.findById(company.getCompany_Id()).orElseThrow(()->new RuntimeException("Company not found"));
        return companyRepository.save(company);

    }
    public String delete(Long id){
        companyRepository.findById(id).orElseThrow(()->new RuntimeException("Company not found"));
        return "Employee deleted";

    }
}
