package com.hb.addressapp.addressservice.mapper;

import com.hb.addressapp.addressservice.dto.AddressResponse;
import com.hb.addressapp.addressservice.entity.Address;

public class AddressMapper {

    private AddressMapper() {
    }

    public static AddressResponse toResponse(Address entity) {
        return new AddressResponse(
                entity.getId(),
                entity.getNumber(),
                entity.getStreet(),
                entity.getCity(),
                entity.getState(),
                entity.getZip(),
                entity.getUserId()
        );
    }

}
