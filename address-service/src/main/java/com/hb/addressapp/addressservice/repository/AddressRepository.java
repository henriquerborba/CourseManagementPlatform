package com.hb.addressapp.addressservice.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hb.addressapp.addressservice.entity.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

    Optional<Address> findByUserId(UUID userId);

}
