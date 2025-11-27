package com.example.employee_management_api.controller;

import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.entity.Employee;
import com.example.employee_management_api.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public Employee create( @RequestBody EmployeeDTO dto) {
        return service.createEmployee(dto);
    }
}
