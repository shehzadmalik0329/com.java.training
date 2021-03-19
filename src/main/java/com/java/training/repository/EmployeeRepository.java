package com.java.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.java.training.model.Employee;

@Repository
//@Controller
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
