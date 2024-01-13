package com.hb.addressapp.addressservice.dto;

import java.util.UUID;

public record AddressRequest(
    Integer number, 
    String street, 
    String city,
    String state,
    String zip,
    String country,
    UUID userId
    ) {
    
}
