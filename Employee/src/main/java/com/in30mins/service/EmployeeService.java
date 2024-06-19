package com.in30mins.service;

import com.in30mins.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> emloyeeList =new ArrayList<>(
            Arrays.asList( new Employee(101,"raju@gmail.com","Raju"),
                    new Employee(102,"employee1@gmail.com","Employee1")
            )
    );


    public List<Employee> getAllEmployees() {
        return emloyeeList;
    }

    public Employee getByEmployeeId(Integer id) {
        return emloyeeList.stream().filter(e->(e.getId()==id)).findFirst().get();
    }

    public void create(Employee employee){
        emloyeeList.add(employee);
    }

    public void update(Employee employee){
        List<Employee> temp = new ArrayList<>();
        for (Employee emp : emloyeeList){
            if (emp.getId()==employee.getId()){
                emp.setName(employee.getName());
                emp.setEmail(employee.getEmail());
            }
            temp.add(emp);
        }
        this.emloyeeList=temp;
    }
    public void delete(Integer id){
        ArrayList<Employee> temp = new ArrayList<>();
        for (Employee emp :emloyeeList){
            if (emp.getId()==id)
                continue;
            temp.add(emp);

        }
        this.emloyeeList=temp;
    }
}
