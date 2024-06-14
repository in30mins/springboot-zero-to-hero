package com.in30mins.repository;

import com.in30mins.model.Employee;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeRepository {
    public Map<Integer,Employee> employees = new HashMap<>();

    public Employee createEmp(Employee emp){
        Integer empId = employees.size()+1;
        emp.setEmpId(empId);
        employees.put(empId,emp);
        return emp;
    }

    public Collection<Employee> getAll() {
        return employees.values();

    }

    public Employee getBy(Integer id) {
        return employees.get(id);
    }

    public void deleteEmp(Integer id) {
        employees.remove(id);
    }

    public Employee update(Integer id, String newEmail) {
        Employee emp = employees.get(id);
        emp.setEmail(newEmail);
        employees.put(id,emp);
        return emp;
    }
}
