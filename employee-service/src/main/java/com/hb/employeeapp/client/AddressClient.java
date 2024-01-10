package com.hb.employeeapp.client;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hb.employeeapp.dto.AddressResponse;

@FeignClient(name = "address-service", path = "/address")
public interface AddressClient {
    
        @GetMapping("/{userId}")
        public AddressResponse getAddressByUserId(@PathVariable UUID userId);

}
