package com.SpringBootApp.SpringBootEmployees.repository;

import com.SpringBootApp.SpringBootEmployees.entity.EmployeeTable;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeTable,Integer> {
}
