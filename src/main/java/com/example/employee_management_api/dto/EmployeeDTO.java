package com.example.employee_management_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be empty")
    @Schema(description = "Employee name", example = "John Doe")
    private String name;

    @NotBlank
    @Schema(description = "Employee department", example = "HR")
    private String department;

    @Email
    @Schema(description = "Employee email", example = "test@gmail.com")
    private String email;

    @Positive
    @Schema(description = "Employee email", example = "10000")
    private Double salary;

    @Pattern(regexp = "^[0-9]{10}$")
    @Schema(description = "Employee phone", example = "7893444444")
    private String phone;
}
