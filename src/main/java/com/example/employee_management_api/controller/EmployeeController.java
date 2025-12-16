package com.example.employee_management_api.controller;

import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.entity.Employee;
import com.example.employee_management_api.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping

    @Operation(summary = "Create Employee")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Employee created"),
            @ApiResponse(responseCode = "400", description = "Validation Failed")
    })
    public Employee create(@Valid @RequestBody EmployeeDTO dto) {
        log.info("Received request to create employee: {}", dto);
        Employee employee = service.createEmployee(dto);
        log.info("Employee created successfully: {}", employee);
        return employee;
    }
}
