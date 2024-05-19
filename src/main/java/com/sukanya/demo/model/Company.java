package com.sukanya.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private String company_name;
   private Long  Company_Id;
   private String Company_Location;
   private String Sector;
   private Long Number_Of_Employees;


}
