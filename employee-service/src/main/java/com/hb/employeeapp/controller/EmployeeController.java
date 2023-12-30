package com.hb.employeeapp.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hb.employeeapp.entity.Employee;
import com.hb.employeeapp.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;


@RestController
@Tag(name = "Employee")
@RequiredArgsConstructor
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping("{id}")
    @Operation(summary = "Get employee details by id")
    public Employee getEmployeeDetails(@PathVariable UUID id) {
        return service.getEmployeeDetails(id);
    }
    
}
