package com.in30mins.service;

import com.in30mins.model.Employee;
import com.in30mins.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepo;

    public Employee createEmp(Employee emp){
        return empRepo.createEmp(emp);
    }

    public Collection<Employee> getAll(){
        return empRepo.getAll();
    }

    public Employee getId(Integer id) {
        return empRepo.getBy(id);
    }

    public void deleteEmp(Integer id) {
        empRepo.deleteEmp(id);
    }

    public Employee updateBy(Integer id, String newEmail) {
        return empRepo.update(id,newEmail);
    }
}
