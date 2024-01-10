package com.hb.employeeapp.dto;

import java.util.UUID;

import lombok.With;


@With
public record EmployeeResponse(
        UUID id,
        String name,
        String email,
        AddressResponse address) {

}
