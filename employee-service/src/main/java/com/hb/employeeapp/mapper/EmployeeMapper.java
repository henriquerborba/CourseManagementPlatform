package com.hb.employeeapp.mapper;

import org.mapstruct.Mapper;

import com.hb.employeeapp.dto.EmployeeResponse;
import com.hb.employeeapp.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    public EmployeeResponse toResponse(Employee employee);
}
