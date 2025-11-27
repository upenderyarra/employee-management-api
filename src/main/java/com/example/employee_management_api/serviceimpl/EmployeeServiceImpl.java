package com.example.employee_management_api.serviceimpl;

import com.example.employee_management_api.EmployeeRepository;
import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.entity.Employee;
import com.example.employee_management_api.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Override
    public Employee createEmployee(EmployeeDTO dto) {
        Employee emp = Employee.builder()

                .name(dto.getName())
                .department(dto.getDepartment())
                .email(dto.getEmail())
                .salary(dto.getSalary())
                .phone(dto.getPhone())
                .build();
        return employeeRepository.save(emp);
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}
