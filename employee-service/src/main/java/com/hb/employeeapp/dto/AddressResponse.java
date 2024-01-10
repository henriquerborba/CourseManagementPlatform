package com.hb.employeeapp.dto;

import java.util.UUID;

public record AddressResponse(
        UUID id,
        Integer number,
        String street,
        String city,
        String state,
        String zip,
        UUID userId) {

}
