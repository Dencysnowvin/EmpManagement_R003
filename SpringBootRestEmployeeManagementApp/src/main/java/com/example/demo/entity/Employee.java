package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data //for getters setters toString HashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees_info")
public class Employee {
  @Id
  private int emId;
  private String empName;
  private int empSal;
  private String empDesg;
  private Date empDOJ;
  
}
