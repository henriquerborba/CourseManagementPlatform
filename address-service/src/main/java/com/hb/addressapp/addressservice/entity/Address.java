package com.hb.addressapp.addressservice.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Address {

    @Id
    @GeneratedValue(generator = "uuid4")
    private UUID id;

    private Integer number;

    private String street;

    private String city;

    private String state;

    private String zip;

    @Column(name = "user_id")
    private UUID userId;

}
