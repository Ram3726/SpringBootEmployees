package com.SpringBootApp.SpringBootEmployees.service;


import com.SpringBootApp.SpringBootEmployees.entity.EmployeeTable;
import com.SpringBootApp.SpringBootEmployees.model.Employee;
import com.SpringBootApp.SpringBootEmployees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveData(Employee employee){
        EmployeeTable employeeTable = new EmployeeTable();
        employeeTable.setEName(employee.getName());
        employeeTable.setEmpID(employee.getEmpId());
        employeeTable.setDeptName(employee.getDept());

        try{
            employeeRepository.save(employeeTable);


        }catch(Exception e){
            System.err.println("Error Details"+e.getMessage());

        }

        return "Data save successful";
    }








}
