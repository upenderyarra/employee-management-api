package com.example.employee_management_api.service;

import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(EmployeeDTO employee);
    Employee updateEmployee(Long id,EmployeeDTO employee);
    void deleteEmployee(Long id);
    Employee getEmployee(Long id);
    List<Employee> getAllEmployees();


}
