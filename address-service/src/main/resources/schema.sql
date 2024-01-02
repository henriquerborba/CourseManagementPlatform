-- Active: 1704163172283@@127.0.0.1@5433@address

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE IF EXISTS address;

CREATE TABLE
    IF NOT EXISTS address (
        id UUID DEFAULT uuid_generate_v4() PRIMARY KEY,
        street VARCHAR(100) NOT NULL,
        number VARCHAR(100) NOT NULL,
        city VARCHAR(100) NOT NULL,
        state VARCHAR(100) NOT NULL,
        country VARCHAR(100) NOT NULL,
        zip_code VARCHAR(100) NOT NULL,
        user_id UUID NOT NULL
    );