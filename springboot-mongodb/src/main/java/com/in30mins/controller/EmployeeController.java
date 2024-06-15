package com.in30mins.controller;

import com.in30mins.model.Employee;
import com.in30mins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveData(@RequestBody Employee employee){
        return employeeService.saveDataEmp(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getData(){
        return employeeService.getEmployeesDate();
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable String id){
        return employeeService.getByEmoId(id);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable String id){
        return employeeService.deleteEmpId(id);

    }

    @PutMapping("update/{id}")
    public Employee updateId(@PathVariable String id,
                             @RequestBody Employee employee){
        return employeeService.getUpdate(id,employee);
    }
}
