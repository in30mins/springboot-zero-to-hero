package com.in30mins.service.impl;

import com.in30mins.model.Employee;
import com.in30mins.repository.EmployeeRepository;
import com.in30mins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveDataEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesDate() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getByEmoId(String id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public String deleteEmpId(String id) {
        employeeRepository.deleteById(id);
        return id+" : is deleted Successfully...";
    }

    @Override
    public Employee getUpdate(String id, Employee employee) {
        Optional<Employee> e = employeeRepository.findById(id);
        if(e.isPresent()) {
            Employee pro = e.get();
            pro.setId(employee.getId());
            pro.setName(employee.getName());
            pro.setLocation(employee.getLocation());
            pro.setRole(employee.getRole());
            return employeeRepository.save(pro);
        }else {
            return null;
        }

    }

}
