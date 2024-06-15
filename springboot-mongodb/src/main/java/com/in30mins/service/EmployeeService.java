package com.in30mins.service;

import com.in30mins.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveDataEmp(Employee employee);

    List<Employee> getEmployeesDate();

    Employee getByEmoId(String id);


    String deleteEmpId(String id);

    Employee getUpdate(String id, Employee employee);
}
