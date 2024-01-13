package com.hb.addressapp.addressservice.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hb.addressapp.addressservice.dto.AddressRequest;
import com.hb.addressapp.addressservice.dto.AddressResponse;
import com.hb.addressapp.addressservice.mapper.AddressMapper;
import com.hb.addressapp.addressservice.service.AddressService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Address")
@RestController
@RequiredArgsConstructor
@RequestMapping("address")
public class AddressController {

    private final AddressService service;

    @GetMapping("/{userId}")
    @Operation(summary = "Get address by user id")
    public AddressResponse getAddressByUserId(@PathVariable UUID userId) {
        return AddressMapper.toResponse(service.getAddressByUserId(userId));
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Create address")
    public void createAddress(@RequestBody AddressRequest request) {
        service.createAddress(request);
    }
}
