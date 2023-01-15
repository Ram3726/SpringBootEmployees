package com.SpringBootApp.SpringBootEmployees.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "Employee_table")


public class EmployeeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eId;

    @Column(name = "E_name")
    private String eName;

    @Column(name= "emp_id")
    private int empID;

    @Column(name = "dept_name",columnDefinition = "unique")
    private String deptName;

}
