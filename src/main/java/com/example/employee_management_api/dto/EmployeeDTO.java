package com.example.employee_management_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EmployeeDTO {
    private String name;
    private String department;
    private String email;
    private Double salary;
    private String phone;
}
