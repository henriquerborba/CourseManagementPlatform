package com.hb.employeeapp.service;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.hb.employeeapp.client.AddressClient;
import com.hb.employeeapp.dto.EmployeeResponse;
import com.hb.employeeapp.mapper.EmployeeMapper;
import com.hb.employeeapp.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    private final EmployeeMapper mapper;

    private final AddressClient addressClient;

    public EmployeeResponse getEmployeeDetails(UUID id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .map(response -> {
                    response.withAddress(addressClient.getAddressByUserId(id));
                    return response;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
    }

}
