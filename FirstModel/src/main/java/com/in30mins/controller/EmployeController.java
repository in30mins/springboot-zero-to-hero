package com.in30mins.controller;

import com.in30mins.model.Employee;
import com.in30mins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class EmployeController {
    @Autowired
    private EmployeeService empSer;   //Dependency Injection

    @PostMapping("/save")
    public Employee create(@RequestBody Employee emp){
        return empSer.createEmp(emp);
    }

    @GetMapping("/all")
    public Collection<Employee> getAll(){
        return empSer.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        return empSer.getId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        empSer.deleteEmp(id);
    }

    @PutMapping("/{id}/{newEmail}")
    public Employee update(@PathVariable("id") Integer id,
                           @PathVariable String newEmail){
        return empSer.updateBy(id,newEmail);
    }
}
