package com.example.employee_management_api.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank
    private String department;

    @Email
    private String email;

    @Positive
    private Double salary;

    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;
}
