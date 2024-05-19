package com.sukanya.demo.repository;

import com.sukanya.demo.model.Company;
import com.sukanya.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long>  {
}
