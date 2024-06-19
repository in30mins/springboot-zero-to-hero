package com.in30mins.controller;

import com.in30mins.entity.Employee;
import com.in30mins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{id}")
    public Employee getById(@PathVariable Integer id){
        return employeeService.getByEmployeeId(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public void create(@RequestBody Employee employee){
        employeeService.create(employee);
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.PUT)
    public void update(@PathVariable Integer id, @RequestBody Employee employee){
        employeeService.update(employee);
    }

    @RequestMapping(value = "/employees/{id}",method = RequestMethod.DELETE)
    public List<Employee> delete(@PathVariable Integer id){
        employeeService.delete(id);
        return employeeService.getAllEmployees();
    }
}
