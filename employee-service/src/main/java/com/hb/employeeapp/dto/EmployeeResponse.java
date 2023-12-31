package com.hb.employeeapp.dto;

import java.util.UUID;

public record EmployeeResponse(
        UUID id,
        String name,
        String email) {

}
