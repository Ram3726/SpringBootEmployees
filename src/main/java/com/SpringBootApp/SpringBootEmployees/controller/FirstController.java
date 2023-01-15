package com.SpringBootApp.SpringBootEmployees.controller;

import com.SpringBootApp.SpringBootEmployees.model.Employee;
import com.SpringBootApp.SpringBootEmployees.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")

public class FirstController {
    @Autowired
    FirstService firstService;

    @RequestMapping("/test")
    public String test(){
        return "Test method executed";
    }

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee){
        this.firstService.saveData(employee);
        return "save success";
    }


}
