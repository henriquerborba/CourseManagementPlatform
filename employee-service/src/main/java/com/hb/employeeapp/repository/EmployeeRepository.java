package com.hb.employeeapp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hb.employeeapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

}
