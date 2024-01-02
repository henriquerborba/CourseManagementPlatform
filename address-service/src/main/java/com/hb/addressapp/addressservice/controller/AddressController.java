package com.hb.addressapp.addressservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hb.addressapp.addressservice.dto.AddressResponse;
import com.hb.addressapp.addressservice.mapper.AddressMapper;
import com.hb.addressapp.addressservice.service.AddressService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("address")
public class AddressController {

    private final AddressService service;

    @GetMapping("/{userId}")
    public AddressResponse getAddressByUserId(@PathVariable UUID userId) {
        return AddressMapper.toResponse(service.getAddressByUserId(userId));
    }
}
